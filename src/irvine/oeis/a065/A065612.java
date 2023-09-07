package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065612 Square roots of terms in A065611.
 * @author Sean A. Irvine
 */
public class A065612 extends A065611 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
