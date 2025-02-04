package irvine.oeis.a074;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074920 Integers k such that phi(k) = 6k/Pi^2 rounded to nearest integer.
 * @author Sean A. Irvine
 */
public class A074920 extends Sequence1 {

  private static final CR PI26 = CR.SIX.divide(CR.PI.square());
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.PHI.z(++mN).equals(PI26.multiply(mN).round())) {
        return Z.valueOf(mN);
      }
    }
  }
}
