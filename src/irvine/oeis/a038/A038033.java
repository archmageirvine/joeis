package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a000.A000313;

/**
 * A038033 a(n) = A000166(n-1)*n*(n-1).
 * @author Sean A. Irvine
 */
public class A038033 extends A000313 {

  {
    next();
    next();
    next();
  }

  @Override
  public Z next() {
    return super.next().multiply(6);
  }
}
