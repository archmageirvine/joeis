package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026601 Numbers k such that A026600(k) = 1.
 * @author Sean A. Irvine
 */
public class A026601 extends A026600 {

  private long mN = 0;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!Z.ONE.equals(super.next()));
    return Z.valueOf(mN);
  }
}
