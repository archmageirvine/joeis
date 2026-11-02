package irvine.oeis;

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * The Engel expansion of a real number.
 * Recoded from A014012 of Sean A. Irvine.
 * The {@link PierceExpansionSequence} differs from this expansion only by the
 * alternating signs of the unit fractions.
 * @author Georg Fischer
 */
public abstract class EngelExpansionSequence extends AbstractSequence {

  private static final int DEFOFF = 1;

  protected CR mA;
  protected int mPrec; // the precision for CR.ceil()

  /**
   * Constructor with default precision.
   * @param n number to expand
   */
  public EngelExpansionSequence(final CR n) {
    this(32, n);
  }

  /**
   * Constructor with offset and precision.
   * @param offset first index
   * @param prec precision for CR.ceil()
   * @param n number to expand
   */
  public EngelExpansionSequence(final int offset, final int prec, final CR n) {
    super(offset);
    mPrec = prec;
    mA = n;
  }

  /**
   * Constructor with precision.
   * @param prec precision for CR.ceil()
   * @param n number to expand
   */
  public EngelExpansionSequence(final int prec, final CR n) {
    this(DEFOFF, prec, n);
  }

  @Override
  public Z next() {
    final Z a = mA.inverse().ceil(mPrec);
    mA = mA.multiply(a).subtract(CR.ONE);
    return a;
  }
}
