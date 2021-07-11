package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004610 Expansion of sqrt(6) in base 3.
 * @author Sean A. Irvine
 */
public class A004610 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004610() {
    super(0, CR.SIX.sqrt(), 3);
  }
}
