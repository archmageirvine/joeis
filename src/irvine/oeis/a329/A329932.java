package irvine.oeis.a329;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A329932 Decimal expansion of least positive number x such that csc x + sec x = 1.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A329932 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  // x = arcsec(1/2 (1 - sqrt(-1 + 2 sqrt(2))) - sqrt(2 (-1 + 2 sqrt(2)))))
  private static final CR SQRT6M1 = CR.EIGHT.sqrt().subtract(CR.ONE);
  private static final CR S1 = SQRT6M1.sqrt();
  private static final CR S2 = SQRT6M1.multiply(2).sqrt();

  /** Construct the sequence. */
  public A329932() {
    super(1, REALS.asec(CR.HALF.multiply(CR.ONE.subtract(S1).subtract(S2))));
  }
}
