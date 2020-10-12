package irvine.oeis.a035;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035489 Main diagonal of the Stolarsky array.
 * @author Sean A. Irvine
 */
public class A035489 implements Sequence {

  private static final CR TAU1 = CR.PHI.add(CR.ONE);
  private static final CR HALF_TAU = CR.PHI.divide(CR.TWO);
  private long mN = 0;

  @Override
  public Z next() {
    Z a = TAU1.multiply(++mN).subtract(HALF_TAU).floor();
    if (mN == 1) {
      return a;
    }
    Z b = CR.PHI.multiply(a).round();
    for (int k = 1; k < mN - 1; ++k) {
      final Z d = a.add(b);
      a = b;
      b = d;
    }
    return b;
  }
}

