package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A075612 a(1) = 1, a(n) = smallest prime number not already used such that concatenation of a(k) and a(n) is composite for all k = 1 to n-1.
 * @author Sean A. Irvine
 */
public class A075612 extends CachedSequence {

  /** Construct the sequence. */
  public A075612() {
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
        t = Functions.NEXT_PRIME.z(t);
        if (t.compareTo(m) > 0) {
          m = m.multiply(10);
          for (int k = 1; k < n; ++k) {
            am[k] = am[k].multiply(10);
          }
        }
        for (int k = 1; k < n; ++k) {
          if (am[k].add(t).isProbablePrime()) {
            continue outer;
          }
        }
        return t;
      }
    });
  }
}
