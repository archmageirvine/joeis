package irvine.oeis.a099;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A099289 Decimal expansion of the Fresnel sine integral function at 1.
 * @author Sean A. Irvine
 */
public class A099289 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A099289() {
    super(CrFunctions.FRESNEL_S.cr(CR.ONE));
  }
}
