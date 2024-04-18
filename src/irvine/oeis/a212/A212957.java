package irvine.oeis.a212;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A212957 A(n,k) is the number of moduli m such that the multiplicative order of k mod m equals n; square array A(n,k), n&gt;=1, k&gt;=1, read by antidiagonals.
 * @author Georg Fischer
 */
public class A212957 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A212957() {
    super(1, 1, -1);
    hasRAM(true);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return k == 1 ? Z.ZERO : Integers.SINGLETON.sumdiv(n, d -> Functions.SIGMA0.z(Z.valueOf(k).pow(d).subtract(1)).multiply(Functions.MOBIUS.i(n / d)));
  }
}
