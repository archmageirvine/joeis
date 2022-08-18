package irvine.oeis.a347;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A347329 Decimal expansion of Pi^4/105.
 * @author Sean A. Irvine
 */
public class A347329 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A347329() {
    super(0, CR.PI.pow(4).divide(CR.valueOf(105)));
  }
}
