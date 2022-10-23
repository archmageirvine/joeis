package irvine.oeis.a291;
// manually 2021-10-04

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A291040 The arithmetic function u(n,3,2).
 * @author Georg Fischer
 */
public class A291040 extends Sequence1 {

  protected long mN;
  protected Z mM;
  protected long mH;

  /** Construct the sequence. */
  public A291040() {
    this(1, 3, 2);
  }

  /**
   * Generic constructor with parameters
   * @param m 
   * @param h 
   */
  public A291040(final int offset, final long m, final long h) {
    mN = offset - 1;
    mM = Z.valueOf(m);
    mH = h;
  }

  /* Mathematica: 
    u[n_, m_, h_] := (d = Divisors[n]; 
      Min[(h*Ceiling[m/d] - h + 1)*d]);
  */

  @Override
  public Z next() {
    Z result = null;
    ++mN;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      Z t = mM.divide(d);
      if (! mM.remainder(d).isZero()) { // no even divide: ceil
          t = t.add(1);
      }
      t = t.multiply(mH).subtract(mH).add(1).multiply(d);
      if (result == null || t.compareTo(result) < 0) {
        result = t; // min(result, t)
      }
    }
    return result;
  }
}
