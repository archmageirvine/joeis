package irvine.oeis.a347;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A347151 Decimal expansion of erf(2).
 * @author Sean A. Irvine
 */
public class A347151 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A347151() {
    super(CR.TWO.erf());
  }
}
