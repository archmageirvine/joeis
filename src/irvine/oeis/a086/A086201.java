package irvine.oeis.a086;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A086201 Decimal expansion of 1/(2*Pi).
 * @author Sean A. Irvine
 */
public class A086201 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A086201() {
    super(0, CR.TWO.multiply(CR.PI).inverse());
  }
}
