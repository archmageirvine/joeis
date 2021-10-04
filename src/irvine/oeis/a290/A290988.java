package irvine.oeis.a290;
// manually 2021-10-04

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A290988 The arithmetic function v+-(n,3).
 * @author Georg Fischer
 */
public class A290988 implements Sequence {

  protected long mN;
  protected long mH2;

  /** Construct the sequence. */
  public A290988() {
    this(2, 3);
  }

  /**
   * Generic constructor with parameter
   * @param offset first index
   * @param h second parameter of function <code>vpm</code>
   */
  public A290988(final int offset, final int h) {
    mN = offset - 1;
    mH2 = 2L * h;
  }

  /* Mathematica:
    vpm[n_, h_] := (d = Divisors[n];
    Max[(2*Floor[(d - 2)/(2*h)] + 1)*n/d]);
  */

  @Override
  public Z next() {
    Z result = Z.ZERO;
    ++mN;
    for (final Z d : Cheetah.factor(mN).divisors()) {
      Z t = d.subtract(2);
      t = t.compareTo(Z.ZERO) >= 0 ? t.divide(mH2) : t.divide(mH2).subtract(1); // floor
      t = t.multiply2().add(1).multiply(mN).divide(d);
      if (t.compareTo(result) > 0) {
        result = t; // max(result, t)
      }
    }
    return result;
  }
}
