package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004595 Expansion of e in base 4.
 * @author Sean A. Irvine
 */
public class A004595 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004595() {
    super(1, CR.E, 4);
  }
}
