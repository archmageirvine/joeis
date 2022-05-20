package irvine.oeis.a119;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A119726 Triangular array read by rows: T(n,1) = T(n,n) = 1, T(n,k) = 4*T(n-1, k-1) + 2*T(n-1, k).
 * @author Georg Fischer
 */
public class A119726 extends Triangle {

  /** Construct the sequence. */
  public A119726() {
    hasRAM(false);
  }

  @Override
  public Z compute(int n, int k) {
    ++n;
    ++k;
    return k == 1 || k == n ? Z.ONE : get(n - 2, k - 2).multiply(4).add(get(n - 2, k - 1).multiply2());
  }
}
