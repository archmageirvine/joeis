package irvine.oeis.a001;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A001622 Decimal expansion of golden ratio phi (or tau) = (1 + sqrt(5))/2.
 * @author Sean A. Irvine
 */
public class A001622 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A001622() {
    super(CR.PHI);
  }
}
