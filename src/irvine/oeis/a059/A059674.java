package irvine.oeis.a059;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A059674 Square array a(m,n) = binomial(max(m,n), min(m,n)) (m&gt;=0, n&gt;=0) read by antidiagonals.
 * @author Georg Fischer
 */
public class A059674 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A059674() {
    super(0, 0, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Binomial.binomial(Functions.MAX.l(new long[] {n, k}), LongUtils.min(n, k));
  }
}
