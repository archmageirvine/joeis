package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026415 Numbers k such that A026409(k) is odd.
 * @author Sean A. Irvine
 */
public class A026415 extends A026409 {

  private long mN = 0;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (super.next().isEven());
    return Z.valueOf(mN);
  }
}
