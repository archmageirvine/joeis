package irvine.oeis.a125;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A125177 Triangle read by rows: T(n,0)=C(2n,n)/(n+1) for n&gt;=0; T(0,k)=0 for k&gt;=1; T(n,k)=T(n-1,k)+T(n-1,k-1) for n&gt;=1, k&gt;=1.
 * @author Georg Fischer
 */
public class A125177 extends Triangle {

  /** Construct the sequence. */
  public A125177() {
    hasRAM(false);
  }

  // T:=proc(n, k) if k=0 then binomial(2*n, n)/(n+1) elif n=0 then 0 else T(n-1, k)+T(n-1, k-1) fi end:
  @Override
  public Z compute(final int n, final int k) {
    if (n == 0) {
      return Z.ONE;
    }
    if (k == 0) {
      return Binomial.binomial(2 * n, n).divide(n + 1);
    }
    return get(n - 1, k).add(get(n - 1, k - 1));
  }
}
