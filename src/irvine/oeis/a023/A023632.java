package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023632 a(n) = s(2n+1) - s(2n), where s( ) is sequence A023631.
 * @author Sean A. Irvine
 */
public class A023632 extends A023631 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().negate().add(super.next());
  }
}
