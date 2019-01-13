package irvine.oeis.a015;

import irvine.math.z.Z;

/**
 * A015935.
 * @author Sean A. Irvine
 */
public class A015935 extends A015910 {

  private static final Z Z2048 = Z.valueOf(2048);

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(Z2048.mod(mN))) {
        return mN;
      }
    }
  }
}
