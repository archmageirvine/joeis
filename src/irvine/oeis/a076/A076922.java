package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076922 Smallest number greater than the previous term such that the highest common factor of successive pairs follows the pattern 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, ... ( n repeated n times)given by A002024.
 * @author Sean A. Irvine
 */
public class A076922 extends Sequence1 {

  private long mD = 1;
  private long mM = 2;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = mD;
      ++mD;
    }
    final Z k = mA;
    while (true) {
      mA = mA.add(mD);
      if (mA.mod(mD + 1) == 0 && mM > 0) {
        continue;
      }
      if (Functions.GCD.l(mA, k) == mD && (mM > 0 || mA.mod(mD + 1) == 0)) {
        return mA;
      }
    }
  }
}

