package irvine.oeis.a080;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A080853 Square array of generalized polygonal numbers, read by antidiagonals.
 * <code>T(n, k)=C(k, 0)+C(k, 1)n+C(k, 2)n^2</code>
 * @author Georg Fischer
 */
public class A080853 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A080853() {
    super(0, 0, 1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Binomial.binomial(k, 0).add(Binomial.binomial(k, 1).multiply(n)).add(Binomial.binomial(k, 2).multiply((long) n * n));
  }
}
