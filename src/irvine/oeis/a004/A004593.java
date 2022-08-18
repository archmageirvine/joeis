package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004593 Expansion of e in base 2.
 * @author Sean A. Irvine
 */
public class A004593 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004593() {
    super(2, CR.E, 2);
  }
}
