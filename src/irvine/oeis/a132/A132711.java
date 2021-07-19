package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A132711 Decimal expansion of 21/Pi.
 * @author Sean A. Irvine
 */
public class A132711 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A132711() {
    super(CR.valueOf(21).divide(CR.PI));
  }
}
