package irvine.oeis.a119;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A119725 Triangular array read by rows: T(n,1) = T(n,n) = 1, T(n,k) = 3*T(n-1,k-1) + 2*T(n-1,k).
 * @author Georg Fischer
 */
public class A119725 extends Triangle {

  /** Construct the sequence. */
  public A119725() {
    hasRAM(false);
  }

  @Override
  public Z compute(int n, int k) {
    ++n;
    ++k;
    return k == 1 || k == n ? Z.ONE : get(n - 2, k - 2).multiply(3).add(get(n - 2, k - 1).multiply2());
  }
}
