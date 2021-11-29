package irvine.oeis.a286;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A286563 Triangular table T(n,k) read by rows: T(n, 1) = 1, and for 1 < k <= n, T(n,k) = the highest exponent e such that k^e divides n.
 * @author Georg Fischer
 */
public class A286563 extends Triangle {

  @Override
  public Z compute(int n, int k) {
    ++n;
    ++k;
    if (k == 1) {
      return Z.ONE;
    } else {
      long e = 1;
      long pow = k;
      while (n % pow == 0) {
        ++e;
        pow *= k;
      }
      return Z.valueOf(e - 1);
    }
  }
}
