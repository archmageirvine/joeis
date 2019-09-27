package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026406 <code>a(n) = n-th</code> number k such that <code>s(k)</code> is odd, where s <code>= A026400</code>.
 * @author Sean A. Irvine
 */
public class A026406 extends A026400 {

  private long mN = 0;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (super.next().isEven());
    return Z.valueOf(mN);
  }
}
