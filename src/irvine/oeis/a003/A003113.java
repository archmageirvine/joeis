package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003113 Coefficients in expansion of permanent of infinite tridiagonal matrix shown below.
 * @author Sean A. Irvine
 */
public class A003113 extends A003114 {

  private final A003106 mA = new A003106();

  @Override
  public Z next() {
    return super.next().add(mA.next());
  }
}
