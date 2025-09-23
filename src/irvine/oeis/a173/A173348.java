package irvine.oeis.a173;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A173348 Numbers x such that 0 &lt; |x^7 - y^2| &lt; x^(5/2) for some number y.
 * (m=2, n=7).
 * @author Georg Fischer
 */
public class A173348 extends AbstractSequence {

  private int mNp;
  private int mMp;
  private Z mX;
  private CR mPow;

  /** Construct the sequence. */
  public A173348() {
    this(1, 2, 7);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param m first parameter
   * @param n second parameter
   */
  public A173348(final int offset, final int m, final int n) {
    super(offset);
    mMp = m;
    mNp = n;
    mX = Z.ZERO;
    mPow = CR.valueOf(mNp).multiply(CR.ONE.subtract(CR.valueOf(mMp).inverse()).subtract(CR.valueOf(mNp).inverse()));
  }

  /*
     MMA:
     Solutions[n_, m_, lim_] := Module[
       {x, y, t={}, pow=n*(1-1/m-1/n)},
       Do[ y = Round[x^(n/m)];
           If[0 < Abs[x^n - y^m] < x^pow, AppendTo[t, x]], {x, lim}
         ]; t
     ]; Solutions[7, 2, 10^7]
  */
  @Override
  public Z next() {
    while (true) {
      mX = mX.add(Z.ONE);
      final Z y = CR.valueOf(mX).pow(new Q(mNp, mMp)).round();
      final Z mid = mX.pow(mNp).subtract(y.pow(mMp)).abs();
      if (Z.ZERO.compareTo(mid) < 0 && CR.valueOf(mid).compareTo(CR.valueOf(mX).pow(mPow)) < 0) {
        return mX;
      }
    }
  }
}
