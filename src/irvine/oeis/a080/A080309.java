package irvine.oeis.a080;

import irvine.math.z.Z;

/**
 * A080309 Numbers k such that the k-th positive even number equals the k-th multiple of a Fermat number.
 * @author Sean A. Irvine
 */
public class A080309 extends A080307 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (super.next().equals(mN)) {
        return Z.valueOf(mN / 2);
      }
    }
  }
}

