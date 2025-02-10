package irvine.oeis.a075;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A075122 a(n) = least positive integer &gt; a(n-1) and not a(i)+2*a(j) for 1&lt;=i&lt;j&lt;n.
 * @author Sean A. Irvine
 */
public class A075122 extends CachedSequence {

  private static final Set<Z> FORBIDDEN = new HashSet<>();

  /** Construct the sequence. */
  public A075122() {
    super(1, Integer.class, (self, n) -> {
      if (n == 1) {
        return Z.ONE;
      }
      Z a = self.a(n - 1);
      do {
        a = a.add(1);
      } while (FORBIDDEN.remove(a));
      final Z b = a.multiply2();
      for (int k = 1; k < n; ++k) {
        FORBIDDEN.add(b.add(self.a(k)));
      }
      return a;
    });
  }
}
