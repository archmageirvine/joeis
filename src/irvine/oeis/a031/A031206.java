package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031206.
 * @author Sean A. Irvine
 */
public class A031206 extends A031200 {

  private static final Z Z21 = Z.valueOf(21);

  @Override
  public Z next() {
    while (!Z21.equals(super.next())) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
