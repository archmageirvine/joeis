package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004565 Expansion of sqrt(6) in base 6.
 * @author Sean A. Irvine
 */
public class A004565 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004565() {
    super(1, CR.SIX.sqrt(), 6);
  }
}
