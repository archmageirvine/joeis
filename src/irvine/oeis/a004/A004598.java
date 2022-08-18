package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004598 Expansion of e in base 7.
 * @author Sean A. Irvine
 */
public class A004598 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004598() {
    super(1, CR.E, 7);
  }
}
