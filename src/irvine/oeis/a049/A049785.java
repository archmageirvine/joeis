package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049785 a(n) = Sum_{k=1..n} (n mod floor(n/k)) = T(n,n), array T as in A049783.
 * @author Sean A. Irvine
 */
public class A049785 extends A049783 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(t(++mN, mN));
  }
}
