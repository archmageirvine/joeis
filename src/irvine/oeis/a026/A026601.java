package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026601 <code>a(n)</code> is the n-th number k such that <code>s(k) = 1</code>, where s <code>= A026600</code>.
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
