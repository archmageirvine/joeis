package irvine.oeis;

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * The Engel expansion of a real number.
 * Recoded from A014012 of Sean Irvine.
 * The {@link PierceExpansionSequence} differs from this expansion only by the
 * alternating signs of the unit fractions.
 * @author Georg Fischer
 */
public abstract class EngelExpansionSequence implements Sequence {

  protected CR mA;
  protected int mPrec; // the precision for CR.ceil()

  protected abstract CR getN();

  /**
   * Constructor with default precision
   */
  public EngelExpansionSequence() {
    this(32);
  }

  /**
   * Constructor with precision
   * @param prec precision for CR.ceil()
   */
  public EngelExpansionSequence(final int prec) {
    mPrec = prec;
    mA = getN();
  }

  @Override
  public Z next() {
    final Z a = mA.inverse().ceil(mPrec);
    mA = mA.multiply(a).subtract(CR.ONE);
    return a;
  }
}
