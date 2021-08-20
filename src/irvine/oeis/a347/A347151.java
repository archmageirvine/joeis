package irvine.oeis.a347;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A099286 Decimal expansion of the error function at 1.
 * @author Sean A. Irvine
 */
public class A347151 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A347151() {
    super(CR.TWO.erf());
  }
}
