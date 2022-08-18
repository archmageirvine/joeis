package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004602 Expansion of Pi in base 3.
 * @author Sean A. Irvine
 */
public class A004602 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004602() {
    super(2, CR.PI, 3);
  }
}
