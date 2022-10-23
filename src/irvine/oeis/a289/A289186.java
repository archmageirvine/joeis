package irvine.oeis.a289;
// manually 2021-10-04

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A289186 The arithmetic function v_4(n,5).
 * @author Georg Fischer
 */
public class A289186 extends Sequence2 {

  protected long mN;
  protected Z mG;
  protected long mH;

  /** Construct the sequence. */
  public A289186() {
    this(2, 4, 5);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param g 
   * @param h 
   */
  public A289186(final int offset, final int g, final int h) {
    mN = offset - 1;
    mG = Z.valueOf(g);
    mH = h;
  }

  /* Mathematica: 
    v[g_, n_, h_] := (d = Divisors[n]; 
      Max[(Floor[(d - 1 - GCD[d, g])/h] + 1)*n/d]); 
  */

  @Override
  public Z next() {
    Z result = Z.ZERO;
    ++mN;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      Z t = d.subtract(1).subtract(d.gcd(mG));
      t = (t.compareTo(Z.ZERO) < 0 ? t.divide(mH) : t.divide(mH).add(1)).multiply(mN).divide(d);
      if (t.compareTo(result) > 0) {
        result = t; // max(result, t)
      }
    }
    return result;
  }
}
