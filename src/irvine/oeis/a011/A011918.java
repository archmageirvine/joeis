package irvine.oeis.a011;

import irvine.math.z.Z;

/**
 * A011918 a(n) = A011916(n) + A011922(n) - 1.
 * @author Sean A. Irvine
 */
public class A011918 extends A011916 {

  private final A011922 mA = new A011922();
  {
    next(); // skip 0th term
  }

  @Override
  public Z next() {
    return super.next().add(mA.next()).subtract(1);
  }
}
