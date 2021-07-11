package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004586 Expansion of sqrt(10) in base 2.
 * @author Sean A. Irvine
 */
public class A004586 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004586() {
    super(0, CR.TEN.sqrt(), 3);
  }
}
