package irvine.oeis.a078;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A078140 Convolutory inverse of signed lower Wythoff sequence.
 * @author Sean A. Irvine
 */
public class A078140 extends CachedSequence {

  private static Z w(final int n) {
    return CR.PHI.multiply(n).floor();
  }

  /** Construct the sequence. */
  public A078140() {
    super(1, Integer.class, (self, n) -> {
      if (n == 1) {
        return Z.ONE;
      }
      boolean pos = true;
      Z sum = Z.ZERO;
      for (int k = 1; k < n; ++k) {
        sum = sum.signedAdd(pos, self.a(k).multiply(w(n + 1 - k)));
        pos = !pos;
      }
      return sum.multiply(Z.NEG_ONE.pow(n));
    });
  }
}

