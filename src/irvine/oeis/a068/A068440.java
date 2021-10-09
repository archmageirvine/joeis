package irvine.oeis.a068;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A068440 Expansion of Pi in base 15.
 * @author Sean A. Irvine
 */
public class A068440 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A068440() {
    super(0, CR.PI, 15);
  }
}
