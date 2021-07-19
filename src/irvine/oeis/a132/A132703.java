package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A132703 Decimal expansion of 13/Pi.
 * @author Sean A. Irvine
 */
public class A132703 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A132703() {
    super(CR.valueOf(13).divide(CR.PI));
  }
}
