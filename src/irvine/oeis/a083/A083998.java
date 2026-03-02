package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A083998 a(1) = 3; then numbers such that the concatenation a(n)a(n-1)...a(2)a(1)a(2)...a(n-1)a(n) is a prime.
 * @author Sean A. Irvine
 */
public class A083998 extends CachedSequence {

  /** Construct the sequence. */
  public A083998() {
    super(1, Integer.class, (self, n) -> {
      if (n == 1) {
        return Z.THREE;
      }
      final StringBuilder sb = new StringBuilder();
      for (int k = n - 1; k > 0; --k) {
        sb.append(self.a(k));
      }
      for (int k = 2; k < n; ++k) {
        sb.append(self.a(k));
      }
      long j = -1;
      while (true) {
        j += 2;
        if (new Z(j + sb.toString() + j).isProbablePrime()) {
          return Z.valueOf(j);
        }
      }
    });
  }
}
