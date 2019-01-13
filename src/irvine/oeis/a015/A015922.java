package irvine.oeis.a015;

import irvine.math.z.Z;

/**
 * A015922.
 * @author Sean A. Irvine
 */
public class A015922 extends A015910 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(Z.EIGHT.mod(mN))) {
        return mN;
      }
    }
  }
}
