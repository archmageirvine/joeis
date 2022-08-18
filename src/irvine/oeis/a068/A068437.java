package irvine.oeis.a068;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A068437 Expansion of Pi in base 12.
 * @author Sean A. Irvine
 */
public class A068437 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A068437() {
    super(1, CR.PI, 12);
  }
}
