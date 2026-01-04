package irvine.oeis.a392;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A392026 allocated for Artur Jasinski.
 * @author Sean A. Irvine
 */
public class A392026 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A392026() {
    super(3, CR.PI.multiply(113).add(355));
  }
}
