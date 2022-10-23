package irvine.oeis.a026;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A026351 a(n) = floor(n*phi) + 1, where phi = (1+sqrt(5))/2.
 * @author Sean A. Irvine
 */
public class A026351 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return CR.PHI.multiply(++mN).floor().add(1);
  }
}
