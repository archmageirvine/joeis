package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023630 a(n) = s(2n) - s(2n-1), where s( ) is sequence A023629.
 * @author Sean A. Irvine
 */
public class A023630 extends A023629 {

  @Override
  public Z next() {
    return super.next().negate().add(super.next());
  }
}
