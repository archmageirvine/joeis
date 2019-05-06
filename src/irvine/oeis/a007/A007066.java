package irvine.oeis.a007;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007066 <code>a(n) = 1 + ceiling((n-1)*phi^2)</code>, phi <code>= (1+sqrt(5))/2</code>.
 * @author Sean A. Irvine
 */
public class A007066 implements Sequence {

  private static final CR PHI2 = CR.PHI.multiply(CR.PHI);
  private long mN = -1;

  @Override
  public Z next() {
    return PHI2.multiply(CR.valueOf(++mN)).ceil().add(1);
  }
}
