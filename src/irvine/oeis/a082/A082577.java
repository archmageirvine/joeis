package irvine.oeis.a082;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082577 a(n) = first digit to the right of decimal point of n*(sqrt(5)-1)/2.
 * @author Sean A. Irvine
 */
public class A082577 extends Sequence1 {

  private static final CR C = CR.TEN.divide(CR.PHI);
  private long mN = 0;

  @Override
  public Z next() {
    return C.multiply(++mN).floor().mod(Z.TEN);
  }
}
