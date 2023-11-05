package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A001137 Number of black-rooted red-black trees with n internal nodes.
 * @author Sean A. Irvine
 */
public class A001137 extends CachedSequence {

  /** Construct the sequence. */
  public A001137() {
    super(1, Integer.class, (self, n) -> {
      if (n <= 1) {
        return Z.ONE;
      }
      Z t = Z.ZERO;
      for (int m = (n + 4) / 4; m <= (n + 1) / 2; ++m) {
        t = t.add(Binomial.binomial(2L * m, n + 1 - 2L * m).multiply(self.a(m - 1)));
      }
      return t;
    });
  }
}
