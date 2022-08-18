package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004600 Expansion of e in base 9.
 * @author Sean A. Irvine
 */
public class A004600 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004600() {
    super(1, CR.E, 9);
  }
}
