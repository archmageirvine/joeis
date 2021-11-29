package irvine.oeis.a285;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A285425 Square array A(n,k), n&gt;=1, k&gt;=0, read by antidiagonals,
 * where column k is the expansion of Sum_{j&gt;=1} (2*j - 1)^k*x^(2*j-1)/(1 - x^(2*j-1)).
 * A(n,k) is the sum of k-th powers of odd divisors of n.
 * @author Georg Fischer
 */
public class A285425 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A285425() {
    super(1, 0, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    Z sumd = Z.ZERO;
    for (final Z dd : Cheetah.factor(n).divisors()) {
      if (dd.isOdd()) {
        sumd = sumd.add(dd.pow(k));
      }
    }
    return sumd;
  }
}
