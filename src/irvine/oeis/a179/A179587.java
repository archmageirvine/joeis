package irvine.oeis.a179;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A179587 Decimal expansion of the volume of square cupola with edge length 1.
 * @author Sean A. Irvine
 */
public class A179587 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A179587() {
    super(CR.ONE.add(CR.EIGHT.sqrt().divide(CR.THREE)));
  }
}
