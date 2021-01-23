package irvine.oeis.a007;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007066 a(n) = 1 + ceiling((n-1)*phi^2), phi = (1+sqrt(5))/2.
 * @author Sean A. Irvine
 */
public class A007066 implements Sequence {

  private static final CR PHI2 = CR.PHI.multiply(CR.PHI);
  private long mN = -1;

  @Override
  public Z next() {
    return PHI2.multiply(++mN).ceil().add(1);
  }
}
