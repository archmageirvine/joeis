package irvine.oeis.a185;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A185651 A(n,k) = Sum_{d|n} phi(d)*k^(n/d); square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Georg Fischer
 */
public class A185651 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A185651() {
    super(0, 0, -1);
    hasRAM(true);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    // A(n,k) = Sum_{i=1..n} k^gcd(n,i).
    return (n == 0 || k == 0) ? Z.ZERO : Integers.SINGLETON.sum(1, n, i -> Z.valueOf(k).pow(Functions.GCD.i(n, i)));
  }
}
