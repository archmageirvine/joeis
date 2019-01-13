package irvine.oeis.a015;

import irvine.math.z.Z;

/**
 * A015932.
 * @author Sean A. Irvine
 */
public class A015932 extends A015910 {

  private static final Z Z1024 = Z.valueOf(1024);

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(Z1024.mod(mN))) {
        return mN;
      }
    }
  }
}
