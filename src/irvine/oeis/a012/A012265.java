package irvine.oeis.a012;

import irvine.math.z.Z;

/**
 * A012265.
 * @author Sean A. Irvine
 */
public class A012265 extends A012264 {

  @Override
  public Z next() {
    return super.next().subtract(1).divide2();
  }
}
