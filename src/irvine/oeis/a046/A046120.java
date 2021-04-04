package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046120.
 * @author Sean A. Irvine
 */
public class A046120 extends A046118 {

  @Override
  public Z next() {
    return super.next().add(12);
  }
}
