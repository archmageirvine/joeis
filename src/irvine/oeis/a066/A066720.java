package irvine.oeis.a066;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A066720 The greedy rational packing sequence: a(1) = 1; for n &gt; 1, a(n) is smallest number such that the ratios a(i)/a(j) for 1 &lt;= i &lt; j &lt;= n are all distinct.
 * @author Sean A. Irvine
 */
public class A066720 extends MemorySequence {

  private final HashSet<Z> mSeen = new HashSet<>();
  {
    setOffset(1);
  }

  private boolean is(final Z m) {
    if (mSeen.contains(m.square())) {
      return false;
    }
    for (final Z a : toList()) {
      if (mSeen.contains(a.multiply(m))) {
        return false;
      }
    }
    return true;
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      mSeen.add(Z.ONE);
      return Z.ONE;
    } else if (n == 1) {
      mSeen.add(Z.TWO);
      mSeen.add(Z.FOUR);
      return Z.TWO;
    }
    Z m = a(n - 1);
    while (true) {
      m = m.add(1);
      if (is(m)) {
        for (final Z a : toList()) {
          mSeen.add(a.multiply(m));
        }
        mSeen.add(m.square());
        return m;
      }
    }
  }
}
