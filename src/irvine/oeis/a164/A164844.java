package irvine.oeis.a164;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A164844 Generalized Pascal Triangle - satisfying the same recurrence as Pascal's triangle, but with a(n,0)=1 and a(n,n)=10^n (instead of both being 1).
 * @author Georg Fischer
 */
public class A164844 extends BaseTriangle {

  /** Construct the sequence. */
  public A164844() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    // a(n,k) = Sum_{i = 0..k} 10^i * binomial(n-i-1, n-k-1)), for 0<=k<=n.
    return (k == n) ? Z.TEN.pow(n) : Integers.SINGLETON.sum(0, k, i -> Z.TEN.pow(i).multiply(Binomial.binomial(n - i - 1, n - k - 1)));
  }
}
