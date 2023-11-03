package irvine.oeis.a066;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.RecordSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a033.A033308;
import irvine.oeis.cons.ContinuedFractionSequence;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A030168 Continued fraction for Copeland-Erd\u0151s constant 0.235711... (concatenate primes).
 * @author Sean A. Irvine
 */
public class A066707 extends RecordSequence {

  private static final CR STRANGE_COPELAND_ERDOS = new CR() {

    private final Sequence mDigits = new A033308();
    private Z mUnscaled = Z.ZERO;
    private long mK = 0;

    @Override
    protected Z approximate(final int p) {
      if (p >= 1) {
        return Z.ZERO;
      }
      while (mUnscaled.bitLength() <= -p) {
        mUnscaled = mUnscaled.multiply2().add(mDigits.next());
        ++mK;
      }
      return mUnscaled.shiftLeft(-p - mK);
    }
  };

  /** Construct the sequence. */
  public A066707() {
    super(new ContinuedFractionSequence(new DecimalExpansionSequence(STRANGE_COPELAND_ERDOS)));
  }
}
