package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A001138 Red rooted red-black trees with n internal nodes.
 * @author Sean A. Irvine
 */
public class A001138 extends CachedSequence {

  private static final Z[] SMALL = {Z.ZERO, Z.ONE, Z.ZERO, Z.ONE};

  /** Construct the sequence. */
  public A001138() {
    super(1, Integer.class, (self, n) -> {
      if (n < SMALL.length) {
        return SMALL[n];
      }
      Z t = Z.ZERO;
      for (int m = (n + 4) / 4; m <= (n + 1) / 2; ++m) {
        t = t.add(Binomial.binomial(2L * m, n + 1 - 2L * m).multiply(self.a(m - 1)));
      }
      return t;
    });
  }
}
