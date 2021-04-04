package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046119.
 * @author Sean A. Irvine
 */
public class A046119 extends A046118 {

  @Override
  public Z next() {
    return super.next().add(6);
  }
}
