package irvine.oeis.a257;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A257556 Triangle, read by rows, T(n,k)= Sum_{i=0..(n-k)/2} C(2*k,i)*C(n-2*i-1,k-1).
 * @author Georg Fischer
 */
public class A257556 extends BaseTriangle {

  /** Construct the sequence. */
  public A257556() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return Integers.SINGLETON.sum(0, (n - k) / 2, i -> Binomial.binomial(2L * k, i).multiply(Binomial.binomial(n - 2L * i - 1, k - 1)));
  }
}
