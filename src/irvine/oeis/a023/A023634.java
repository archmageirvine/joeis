package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023634.
 * @author Sean A. Irvine
 */
public class A023634 extends A023633 {

  @Override
  public Z next() {
    super.next();
    return super.next().negate().add(super.next());
  }
}
