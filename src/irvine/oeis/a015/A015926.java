package irvine.oeis.a015;

import irvine.math.z.Z;

/**
 * A015926.
 * @author Sean A. Irvine
 */
public class A015926 extends A015910 {

  private static final Z Z64 = Z.valueOf(64);

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(Z64.mod(mN))) {
        return mN;
      }
    }
  }
}
