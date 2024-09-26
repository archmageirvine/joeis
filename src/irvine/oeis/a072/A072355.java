package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072355 Numbers k such that sigma(k) = (Pi^2)*(k/6) rounded off (where 0.5 is rounded to 0).
 * @author Sean A. Irvine
 */
public class A072355 extends Sequence1 {

  private static final CR PI26 = CR.PI.square().divide(6);
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).equals(PI26.multiply(mN).round())) {
        return Z.valueOf(mN);
      }
    }
  }
}
