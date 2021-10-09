package irvine.oeis.a068;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A068436 Expansion of Pi in base 11.
 * @author Sean A. Irvine
 */
public class A068436 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A068436() {
    super(0, CR.PI, 11);
  }
}
