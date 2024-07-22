package irvine.oeis.a374;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A374169 allocated for Claude H. R. Dequatre.
 * @author Sean A. Irvine
 */
public class A374169 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A374169() {
    super(0, CR.ONE.subtract(CR.E.inverse()).log().divide(2).negate());
  }
}
