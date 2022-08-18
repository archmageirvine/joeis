package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004606 Expansion of Pi in base 7.
 * @author Sean A. Irvine
 */
public class A004606 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004606() {
    super(1, CR.PI, 7);
  }
}
