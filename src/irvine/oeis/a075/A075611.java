package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A075611 a(1) = 1, a(n) = smallest number &gt; a(n-1) such that concatenation a(k) a(n) is prime for all k = 1 to n-1. Stop if no such number exists.
 * @author Sean A. Irvine
 */
public class A075611 extends CachedSequence {

  /** Construct the sequence. */
  public A075611() {
    super(1, Integer.class, (self, n) -> {
      if (n == 1) {
        return Z.ONE;
      }
      Z t = self.a(n - 1);
      Z m = Z.ONE;
      while (m.compareTo(t) <= 0) {
        m = m.multiply(10);
      }
      // am is prescaled versions of a(n)
      final Z[] am = new Z[n];
      for (int k = 1; k < n; ++k) {
        am[k] = self.a(k).multiply(m);
      }
      outer:
      while (true) {
        t = t.add(1);
        if (t.equals(m)) {
          m = m.multiply(10);
          for (int k = 1; k < n; ++k) {
            am[k] = am[k].multiply(10);
          }
        }
        for (int k = 1; k < n; ++k) {
          if (!am[k].add(t).isProbablePrime()) {
            continue outer;
          }
        }
        return t;
      }
    });
  }
}
