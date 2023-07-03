package irvine.oeis;

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * The Pierce expansion of a real number.
 * See A006284: <code>(PARI) r=Pi; for(n=1, 100, s=(r/(r-floor(r))); print1(floor(r), ", "); r=s;)</code>.
 * The {@link EngelExpansionSequence} differs from this expansion only by the
 * positive signs of all unit fractions.
 * @author Sean A. Irvine
 */
public abstract class PierceExpansionSequence extends AbstractSequence {

  private static final int DEFOFF = 0;
  private static final int DEFAULT_PRECISION = 32;
  protected CR mA;
  protected int mPrec; // the precision for CR.floor()

  /**
   * Constructor with default precision
   */
  public PierceExpansionSequence() {
    this(DEFOFF, DEFAULT_PRECISION);
  }

  /**
   * Constructor with offset
   * @param offset first index
   */
  public PierceExpansionSequence(final int offset) {
    this(offset, DEFAULT_PRECISION);
  }

  /**
   * Constructor with precision
   * @param offset first index
   * @param prec precision for CR.floor()
   */
  public PierceExpansionSequence(final int offset, final int prec) {
    super(offset);
    mPrec = prec;
    mA = null;
  }

  protected abstract CR getN();

  @Override
  public Z next() {
    mA = mA == null ? getN().inverse() : mA.divide(mA.subtract(CR.valueOf(mA.floor(mPrec))));
    return mA.floor(mPrec);
  }
}
