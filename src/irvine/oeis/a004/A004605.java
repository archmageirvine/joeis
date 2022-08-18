package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004605 Expansion of Pi in base 6.
 * @author Sean A. Irvine
 */
public class A004605 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004605() {
    super(1, CR.PI, 6);
  }
}
