package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023632 <code>a(n) = s(2n+1) - s(2n)</code>, where <code>s( )</code> is sequence <code>A023631</code>.
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
