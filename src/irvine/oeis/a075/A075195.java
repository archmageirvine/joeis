package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A075195 Jablonski table T(n,k) read by antidiagonals: T(n,k) = number of necklaces with n beads of k colors.
 * @author Georg Fischer
 */
public class A075195 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A075195() {
    super(1, 1, -1);
    hasRAM(true);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    // A(n,k) = 1/n * Sum_{i=1..n} k^gcd(n,i).
    return Integers.SINGLETON.sum(1, n, i -> Z.valueOf(k).pow(Functions.GCD.i(n, i))).divide(n);
  }
}
