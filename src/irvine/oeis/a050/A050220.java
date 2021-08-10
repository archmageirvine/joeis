package irvine.oeis.a050;

import irvine.math.z.Z;

/**
 * A050220.
 * @author Sean A. Irvine
 */
public class A050220 extends A050219 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
