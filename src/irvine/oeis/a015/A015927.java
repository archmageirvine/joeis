package irvine.oeis.a015;

import irvine.math.z.Z;

/**
 * A015927.
 * @author Sean A. Irvine
 */
public class A015927 extends A015910 {

  private static final Z Z128 = Z.valueOf(128);

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(Z128.mod(mN))) {
        return mN;
      }
    }
  }
}
