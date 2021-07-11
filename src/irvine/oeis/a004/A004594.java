package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004594 Expansion of e in base 2.
 * @author Sean A. Irvine
 */
public class A004594 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004594() {
    super(0, CR.E, 3);
  }
}
