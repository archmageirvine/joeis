package irvine.oeis.a194;
// manually 2021-09-13

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A194368 Numbers m such that Sum_{k=1..m} (&lt;1/2 + k*r&gt; - &lt;k*r&gt;) = 0, where r=sqrt(2) and &lt; &gt; denotes fractional part.
 * @author Georg Fischer
 */
public class A194368 implements Sequence {

  protected long mN;
  protected CR mR; // 1st parameter for fractional part
  protected CR mC; // 2nd parameter for fractional part
  protected int mVariant; // type of comparision

  /** Construct the sequence. */
  public A194368() {
    this(2, CR.TWO.sqrt(), CR.HALF);
  }

  /**
   * Generic constructor with parameters
   * @param variant type of comparision
   * @param r 1st parameter for fractional part
   * @param c 2nd parameter for fractional part
   */
  public A194368(final int variant, final CR r, final CR c) {
    mVariant = variant;
    mR = r;
    mC = c;
    mN = 0; // all have offset 1
  }

  /* MMA:
      r = Sqrt[2]; c = 1/2;
      x[n_] := Sum[FractionalPart[k*r], {k, 1, n}]
      y[n_] := Sum[FractionalPart[c + k*r], {k, 1, n}]
      t2 = Table[If[y[n] == x[n], 1, 0], {n, 1, 800}];
      Flatten[Position[t2, 1]] (* A194368 *)
  */

  /**
   * Determine whether a number is a member of the sequence
   * @param n test this number
   * @return true if n is a member, false otherwise
   */
  protected boolean isOk(final long n) {
    boolean result = false;
    CR sum = CR.ZERO;
    for (int k = 1; k <= n; ++k) {
      final CR kr = mR.multiply(CR.valueOf(k));
      sum = sum.add(mC.add(kr).frac()).subtract(kr.frac()); // y - x
    }
    final int cmp = sum.equals(CR.ZERO) ? 0 : sum.signum();
    // System.out.println("n=" + n + ", cmp=" + cmp + ", sum=" + sum.toString(8));
    switch (mVariant) {
      case 1: // <
        result = cmp < 0;
        break;
      case 3: // m/q, ignore (handled differently)
        break;
      case 4: // >
        result = cmp > 0;
        break;
      case 2: // =
      default:
        result = cmp == 0;
        break;
    }
    return result;
  }

  @Override
  public Z next() {
    ++mN;
    while (!isOk(mN)) {
      ++mN;
    }
    return Z.valueOf(mN);
  }
}
