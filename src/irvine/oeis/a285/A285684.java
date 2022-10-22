package irvine.oeis.a285;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a022.A022838;
import irvine.oeis.cons.BeattySequence;

/**
 * A285684 Characteristic sequence of the Beatty sequence, A022838, of sqrt(3).
 * @author Georg Fischer
 */
public class A285684 extends AbstractSequence {

  private int mN;
  private final CR mCr;
  private final int mPolar;

  /** Construct the sequence. */
  public A285684() {
    this(1, new A022838(), 0);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param seq underlying BeattySequence
   * @param polar polarity: 0 for result, 1 for 1 - result
   */
  public A285684(final int offset, final BeattySequence seq, final int polar) {
    super(offset);
    mN = offset - 1;
    mCr = CR.ONE.subtract(CR.ONE.divide(seq.getCR()));
    mPolar = polar;
  }

  @Override
  public Z next() {
    ++mN;
    // floor((n+1)/(1-1/r)) - floor(n(1-1/r)), where r = sqrt(3).
    final Z result = CR.valueOf(mN + 1).multiply(mCr).floor().subtract(CR.valueOf(mN).multiply(mCr).floor());
    return mPolar == 0 ? result : Z.ONE.subtract(result);
  }
}
