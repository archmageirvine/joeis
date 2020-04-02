package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030477.
 * @author Sean A. Irvine
 */
public class A030477 extends A030476 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
