package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004567 Expansion of sqrt(6) in base 8.
 * @author Sean A. Irvine
 */
public class A004567 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004567() {
    super(0, CR.SIX.sqrt(), 8);
  }
}
