package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.util.array.LongDynamicByteArray;

/**
 * A003044 For <code>n &gt; 4, a(n)</code> is the least integer <code>&gt; a(n-1)</code> with precisely two representations <code>a(n) = a(i) + a(j), 1 &lt;= i &lt; j &lt; n</code>; and <code>a(n) = n</code> for <code>n=1..4</code>.
 * @author Sean A. Irvine
 */
public class A003044 extends MemorySequence {

  private final LongDynamicByteArray mReps = new LongDynamicByteArray();

  protected int numReps() {
    return 2;
  }

  @Override
  protected Z computeNext() {
    final long n = size() + 1;
    final long r;
    if (n <= 2 * numReps()) {
      r = n;
    } else {
      long last = get(size() - 1).add(1).longValueExact();
      while (mReps.get(last) != numReps()) {
        ++last;
      }
      r = last;
    }
    for (final Z s : this) {
      final long t = s.add(r).longValueExact();
      final byte v = mReps.get(t);
      if (v <= numReps()) {
        mReps.set(t, (byte) (v + 1));
      }
    }
    return Z.valueOf(r);
  }
}
