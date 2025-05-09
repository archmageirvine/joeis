package irvine.oeis.a077;

import java.util.HashSet;
import java.util.Set;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A077128 Smallest number greater than the previous term which is relatively prime to each of the group of the next n numbers.
 * @author Sean A. Irvine
 */
public class A077128 extends CachedSequence {

  // After R. J. Mathar

  /** Construct the sequence. */
  public A077128() {
    super(1, Integer.class, (self, n) -> {
      if (n == 1) {
        return Z.TWO;
      }
      final Z tr = Functions.TRIANGULAR.z(n - 1);
      final Set<Z> ts = new HashSet<>();
      for (int i = 1; i <= n; ++i) {
        ts.add(tr.add(i));
      }
      Z a = self.a(n - 1);
      while (true) {
        a = a.add(1);
        boolean goodk = true;
        for (final Z k : ts) {
          if (!Functions.GCD.z(a, k).isOne()) {
            goodk = false;
            break;
          }
        }
        if (goodk) {
          return a;
        }
      }
    });
  }
}

