package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026601 a(n) is the n-th number k such that s(k) = 1, where s = A026600.
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
