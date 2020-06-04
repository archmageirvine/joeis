package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionSequence;
import irvine.oeis.DecimalExpansionSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a033.A033308;

/**
 * A030168 Continued fraction for <code>Copeland-Erd\u0151s</code> constant <code>0.235711..</code>. (concatenate primes).
 * @author Sean A. Irvine
 */
public class A030168 extends ContinuedFractionSequence {

  private static final CR COPELAND_ERDOS = new CR() {

    private final Sequence mDigits = new A033308();
    private Z mUnscaled = Z.ZERO;
    private Z mPowersOfTen = Z.ONE;

    @Override
    protected Z approximate(final int p) {
      if (p >= 1) {
        return Z.ZERO;
      }
      while (mUnscaled.bitLength() <= -p) {
        mUnscaled = mUnscaled.multiply(10).add(mDigits.next());
        mPowersOfTen = mPowersOfTen.multiply(10);
      }
      return CR.valueOf(new Q(mUnscaled, mPowersOfTen)).shiftLeft(-p).toZ();
    }
  };

  /** Construct the sequence. */
  public A030168() {
    super(new DecimalExpansionSequence() {
      @Override
      protected CR getCR() {
        return COPELAND_ERDOS;
      }
    });
  }
}
