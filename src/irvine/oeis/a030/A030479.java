package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030479.
 * @author Sean A. Irvine
 */
public class A030479 extends A030478 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}
