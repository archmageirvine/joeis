package irvine.oeis.a226;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A226975 Decimal expansion I_1(1), the modified Bessel function of the first kind.
 * @author Sean A. Irvine
 */
public class A226975 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A226975() {
    super(0, CrFunctions.BESSEL_I.cr(1, CR.ONE));
  }
}
