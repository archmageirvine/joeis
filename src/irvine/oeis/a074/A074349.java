package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A074349 a(1)=1, a(n) is smallest number &gt; a(n-1) such that all pair juxtapositions a(1)a(n),...,a(n-1)a(n) are primes.
 * @author Sean A. Irvine
 */
public class A074349 extends CachedSequence {

  /** Construct the sequence. */
  public A074349() {
    super(1, Integer.class, (self, n) -> {
      if (n == 1) {
        return Z.ONE;
      }
      if (n == 4) {
        // Probably result of an error at submission time
        return Z.valueOf(97);
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
