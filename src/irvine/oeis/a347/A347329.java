package irvine.oeis.a347;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A347329 Decimal expansion of Pi^4/105.
 * @author Sean A. Irvine
 */
public class A347329 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A347329() {
    super(CR.PI.pow(4).divide(CR.valueOf(105)));
  }
}
