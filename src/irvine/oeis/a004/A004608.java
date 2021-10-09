package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004608 Expansion of Pi in base 9.
 * @author Sean A. Irvine
 */
public class A004608 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004608() {
    super(0, CR.PI, 9);
  }
}
