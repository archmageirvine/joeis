package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004586 Expansion of sqrt(10) in base 3.
 * @author Sean A. Irvine
 */
public class A004586 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004586() {
    super(2, CR.TEN.sqrt(), 3);
  }
}
