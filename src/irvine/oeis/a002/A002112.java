package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002112 Glaisher's H numbers.
 * @author Sean A. Irvine
 */
public class A002112 extends A002114 {

  @Override
  public Z next() {
    return super.next().multiply(3);
  }
}
