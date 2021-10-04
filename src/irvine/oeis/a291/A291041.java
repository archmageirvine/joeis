package irvine.oeis.a291;
// manually 2021-10-04

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A291041 The arithmetic function uhat(n,7,4).
 * @author Georg Fischer
 */
public class A291041 implements Sequence {

  protected long mN;
  protected Z mM;
  protected Z mH;

  /** Construct the sequence. */
  public A291041() {
    this(1, 7, 4);
  }

  /**
   * Generic constructor with parameters
   * @param m 
   * @param h 
   */
  public A291041(final int offset, final long m, final long h) {
    mN = offset - 1;
    mM = Z.valueOf(m);
    mH = Z.valueOf(h);
  }

  private static Z delta(final Z r, final Z k, final Z d) {
    Z result = null;
    if (r.compareTo(k) < 0) {
      result = k.subtract(r).multiply(r).subtract(d.subtract(1));
    } else {
      if (k.compareTo(r) < 0 && r.compareTo(d) < 0) {
        result = d.subtract(r).multiply(r.subtract(k)).subtract(d.subtract(1));
      } else {
        result = (k.equals(r) && r.equals(d)) ? d.subtract(1) : Z.ZERO;
      }
    }
    return result;
  }

  protected static Z ceilDiv(final Z num, final Z den) {
    Z result = num.divide(den);
    if (! num.remainder(den).equals(Z.ZERO)) {
      result = result.add(1);
    }
    return result;
  }

  /* Mathematica: 
    delta[r_, k_, d_] := If[r < k
        , (k - r)*r - (d - 1)
        , If[k < r && r < d
            , (d - r)*(r - k) - (d - 1)
            , If[k == r && r == d, d - 1, 0]]] 
    uhat[n_, m_,  h_] := (dx = Divisors[n]; 
      dmin = n; 
      For[i = 1, i ??? Length[dx], i++, d = dx[[i]]; 
        k = m - d*Ceiling[m/d] + d; 
        r = h - d*Ceiling[h/d] + d; 
        If[h ??? Min[k, d - 1]
          , dmin = Min[dmin, n, h*m - h*h + 1, (h*Ceiling[m/d] - h + 1)*d]
          , dmin = Min[dmin, n, h*m - h*h + 1 - delta[r, k, d]]]
      ]; 
      dmin) 
    Table[uhat[n, 7, 4], {n, 1, 70}]  
  */

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    Z dmin = n;
    for (final Z d : Cheetah.factor(mN).divisors()) {
      final Z k = mM.subtract(d.multiply(ceilDiv(mM, d))).add(d);
      final Z r = mH.subtract(d.multiply(ceilDiv(mH, d))).add(d);
      final Z hm1 = mM.subtract(mH).multiply(mH).add(1);
      dmin = dmin.min(n);
      if (mH.compareTo(k.min(d.subtract(1))) <= 0) {
        dmin = dmin.min(hm1.min(mH.multiply(ceilDiv(mM, d)).subtract(mH).add(1).multiply(d)));
      } else {
        dmin = dmin.min(hm1.subtract(delta(r, k, d)));
      }
    }
    return dmin;
  }
}
