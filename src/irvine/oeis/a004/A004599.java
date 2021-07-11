package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004599 Expansion of e in base 8.
 * @author Sean A. Irvine
 */
public class A004599 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004599() {
    super(0, CR.E, 8);
  }
}
