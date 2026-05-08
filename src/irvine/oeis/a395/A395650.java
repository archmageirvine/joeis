package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.oeis.a030.A030178;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395650 allocated for Artur Jasinski.
 * @author Sean A. Irvine
 */
public class A395650 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395650() {
    super(1, CR.PI.divide(new A030178().getCR().add(1)));
  }
}
