package irvine.oeis.a054;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A054382 James Joyce's "Ulysses" sequence: number of digits in n^(n^n).
 * @author Sean A. Irvine
 */
public class A054382 extends Sequence0 {

  private static final CR LOG10 = CR.TEN.log();
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : CR.valueOf(mN).log().divide(LOG10).multiply(CR.valueOf(mN).pow(mN)).floor().add(1);
  }
}
