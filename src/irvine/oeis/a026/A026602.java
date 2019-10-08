package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026602 n-th number k such that <code>s(k) = 2</code>, where s <code>= A026600</code>.
 * @author Sean A. Irvine
 */
public class A026602 extends A026600 {

  private long mN = 0;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!Z.TWO.equals(super.next()));
    return Z.valueOf(mN);
  }
}
