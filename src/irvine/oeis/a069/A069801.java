package irvine.oeis.a069;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069801 Triangular array in which the n-th row consists of numbers with digit product n arranged in increasing numerical order; row consists of 0 if no such numbers exist.
 * @author Sean A. Irvine
 */
public class A069801 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private int mN = 0;

  private void search(final long remaining, final Z t) {
    if (remaining == 1) {
      mA.add(t);
      return;
    }
    for (long k = 2; k <= 9; ++k) {
      if (remaining % k == 0) {
        search(remaining / k, t.multiply(10).add(k));
      }
    }
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      if (++mN == 1) {
        mA.add(Z.ONE);
      } else if (Functions.GPF.l(mN) > 7) {
        mA.add(Z.ZERO);
      } else {
        search(mN, Z.ZERO);
      }
    }
    return mA.pollFirst();
  }
}

