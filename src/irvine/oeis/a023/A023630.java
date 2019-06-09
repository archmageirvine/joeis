package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023630.
 * @author Sean A. Irvine
 */
public class A023630 extends A023629 {

  @Override
  public Z next() {
    return super.next().negate().add(super.next());
  }
}
