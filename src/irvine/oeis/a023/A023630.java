package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023630 <code>a(n) = s(2n) - s(2n-1)</code>, where <code>s( )</code> is sequence <code>A023629</code>.
 * @author Sean A. Irvine
 */
public class A023630 extends A023629 {

  @Override
  public Z next() {
    return super.next().negate().add(super.next());
  }
}
