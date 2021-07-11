package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004578 Expansion of sqrt(8) in base 3.
 * @author Sean A. Irvine
 */
public class A004578 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004578() {
    super(0, CR.EIGHT.sqrt(), 3);
  }
}
