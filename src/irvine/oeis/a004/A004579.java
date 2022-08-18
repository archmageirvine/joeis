package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004579 Expansion of sqrt(8) in base 4.
 * @author Sean A. Irvine
 */
public class A004579 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004579() {
    super(1, CR.EIGHT.sqrt(), 4);
  }
}
