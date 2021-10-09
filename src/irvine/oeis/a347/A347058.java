package irvine.oeis.a347;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A347058 Decimal expansion of (1 + tanh(Pi)) / 2.
 * @author Sean A. Irvine
 */
public class A347058 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A347058() {
    super(CR.PI.tanh().add(CR.ONE).multiply(CR.HALF));
  }
}
