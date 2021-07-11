package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004568 Expansion of sqrt(6) in base 4.
 * @author Sean A. Irvine
 */
public class A004568 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004568() {
    super(0, CR.SIX.sqrt(), 9);
  }
}
