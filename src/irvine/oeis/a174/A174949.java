package irvine.oeis.a174;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A174949 Triangle read by rows: T(n,k) = B(n,k) - B(n,0) + 1 where B(n,k) = 2 * (5*binomial(n,k)*(n+1)!*k!*(n-k)! + (n+k+1)!*(n-k)! + (2*n-k+1)!*k!) / ((n+1)!*k!*(n-k)!).
 * @author Sean A. Irvine
 */
public class A174949 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;

  private Z b(final int n, final int k) {
    final Z f1 = Functions.FACTORIAL.z(n + 1);
    final Z fk = Functions.FACTORIAL.z(k);
    final Z fnk = Functions.FACTORIAL.z(n - k);
    return Binomial.binomial(n, k).multiply(5).multiply(f1).multiply(fk).multiply(fnk)
      .add(fnk.multiply(Functions.FACTORIAL.z(n + k + 1)))
      .add(fk.multiply(Functions.FACTORIAL.z(2 * n - k + 1)))
      .multiply2()
      .divide(f1.multiply(fk).multiply(fnk));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return b(mN, mM).subtract(b(mN, 0)).add(1);
  }
}
