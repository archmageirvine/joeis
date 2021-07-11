package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004546 Expansion of sqrt(2) in base 9.
 * @author Sean A. Irvine
 */
public class A004546 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004546() {
    super(0, CR.SQRT2, 9);
  }
}
