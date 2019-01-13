package irvine.oeis.a015;

import irvine.math.z.Z;

/**
 * A015940.
 * @author Sean A. Irvine
 */
public class A015940 extends A015910 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(mN.subtract(3).mod(mN))) {
        return mN;
      }
    }
  }
}
