package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a014.A014432;

/**
 * A025237 Expansion of <code>(1 -x -sqrt(1-2*x-11*x^2))/(6*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A025237 extends A014432 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(3);
  }
}
