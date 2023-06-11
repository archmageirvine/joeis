package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A064065 n-th step is to add a(n) to each previous number a(k) (excluding itself, i.e., k &lt; n) to produce n more terms of the sequence, starting with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A064065 extends Sequence0 {

  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private long mN = 1;
  private long mM = -1;

  protected A064065(final long a, final long b) {
    mA.set(0, a);
    mA.set(1, b);
  }

  /** Construct the sequence. */
  public A064065() {
    this(0, 1);
  }

  @Override
  public Z next() {
    if (++mM >= mA.length()) {
      final long t = mA.get(mN);
      for (long k = 0, j = mA.length(); k < mN; ++k, ++j) {
        mA.set(j, t + mA.get(k));
      }
      ++mN;
    }
    return Z.valueOf(mA.get(mM));
  }
}
