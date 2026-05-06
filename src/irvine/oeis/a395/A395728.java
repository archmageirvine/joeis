package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A084713.
 * @author Sean A. Irvine
 */
public class A395728 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395728() {
    super(1, CR.FIVE.sqrt().add(1).divide(3));
  }
}
