package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A080816.
 * @author Sean A. Irvine
 */
public class A080826 extends CachedSequence {

  /** Construct the sequence. */
  public A080826() {
    super(1, Integer.class, (self, n) -> {
      if (n == 1) {
        return Z.valueOf(122);
      }
      final StringBuilder sb = new StringBuilder();
      final String l = self.a(n - 1).toString();
      sb.append(l, 0, l.length() - 1);
      for (int k = 1; k <= n - 2; ++k) {
        sb.append(self.a(k).toString());
      }
      return new Z(sb);
    });
  }
}

