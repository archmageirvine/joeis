package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395281 allocated for Dimitris Valianatos.
 * @author Sean A. Irvine
 */
public class A395281 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395281() {
    super(0, CR.PI.multiply(3).divide(13).tan());
  }
}
