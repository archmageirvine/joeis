package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004605 Expansion of Pi in base 6.
 * @author Sean A. Irvine
 */
public class A004605 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004605() {
    super(0, CR.PI, 6);
  }
}
