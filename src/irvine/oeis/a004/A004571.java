package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004571 Expansion of sqrt(7) in base 4.
 * @author Sean A. Irvine
 */
public class A004571 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004571() {
    super(0, CR.SEVEN.sqrt(), 4);
  }
}
