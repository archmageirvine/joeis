package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026415 a(n) = n-th number k such that s(k) is odd, where s = A026409.
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
