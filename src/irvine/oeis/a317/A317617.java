package irvine.oeis.a317;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A317617 Triangle T read by rows: T(n, k) = (n^3 + n)/2 + (k - (n + 1)/2)*(n mod 2).
 * @author Georg Fischer
 */
public class A317617 extends Triangle {

  @Override
  public Z compute(int n, int k) {
    ++n;
    ++k;
    return Z.valueOf(n * n + 1).multiply(n).add((2 * k - n - 1) * (n & 1)).divide2();
  }
}
