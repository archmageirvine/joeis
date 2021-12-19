package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a008.A008683;

/**
 * A007423 a(n) = mu(n) + 1, where mu is the Moebius function.
 * @author Sean A. Irvine
 */
public class A007423 extends A008683 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
