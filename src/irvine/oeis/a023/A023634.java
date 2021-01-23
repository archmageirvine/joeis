package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023634 s(3n)-s(3n-1), where s( ) is sequence A023633.
 * @author Sean A. Irvine
 */
public class A023634 extends A023633 {

  @Override
  public Z next() {
    super.next();
    return super.next().negate().add(super.next());
  }
}
