package irvine.oeis.a084;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084678 a(n)=b(n,n) with b(n,1)=n and b(n,k)=binomial(b(n,k-1),d(n,n-k+1)) for 1&lt;k&lt;=n, where d(n,i) are the divisors of n, d(i)&lt;d(j), 1&lt;=i&lt;j&lt;=A000005(n).
 * @author Sean A. Irvine
 */
public class A084678 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z[] d = Jaguar.factor(++mN).divisorsSorted();
    Z res = Z.valueOf(mN);
    for (int k = d.length - 2; k > 0; --k) {
      res = Binomial.binomial(res, d[k]);
    }
    return res;
  }
}
