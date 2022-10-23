package irvine.oeis.a194;
// manually 2021-09-10

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A194285 Triangular array:  g(n,k)=number of fractional parts (i*sqrt(2)) in interval [(k-1)/n, k/n], for 1&lt;=i&lt;=n, 1&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A194285 extends Sequence1 {

  protected long mN;
  protected long mK;
  protected CR mR; // parameter for fractional part
  protected int mVariant; // parameter for range of i

  /** Construct the sequence. */
  public A194285() { // for V
    this(1, CR.TWO.sqrt());
  }

  /**
   * Generic constructor with parameters
   * @param variant parameter for range of i
   * @param r parameter for fractional part
   */
  public A194285(final int variant, final CR r) {
    mVariant = variant;
    mR = r;
    mN = 0; // offset 1
    mK = 0;
  }

  /* MMA:
      r = Sqrt[2];
      f[n_, k_, i_] := If[(k - 1)/n <= FractionalPart[i*r] < k/n, 1, 0]
      g[n_, k_] := Sum[f[n, k, i], {i, 1, n}]
      TableForm[Table[g[n, k], {n, 1, 20}, {k, 1, n}]]
      Flatten[%]  (* A194285 *)
  */

  protected Z g(final long n, final long k) {
    final long imax;
    switch (mVariant) {
      case 2:
        imax = 2 * n;
        break;
      case 3:
        imax = n * n;
        break;
      case 4:
        imax = 1L << n;
        break;
      case 1:
        // FALL THROUGH
      default:
        imax = mN;
        break;
    }
    long sum = 0;
    final CR cn = CR.valueOf(n);
    for (int i = 1; i <= imax; ++i) {
      final CR irf = mR.multiply(CR.valueOf(i)).frac();
      if (CR.valueOf(k - 1).divide(cn).compareTo(irf) <= 0 && irf.compareTo(CR.valueOf(k).divide(cn)) < 0) {
        ++sum;
      }
    }
    return Z.valueOf(sum);
  }

  @Override
  public Z next() {
    ++mK;
    if (mK > mN) {
      ++mN;
      mK = 1;
    }
    return g(mN, mK);
  }
}
