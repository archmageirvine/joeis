package irvine.oeis.a347;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A347081 Decimal expansion of (91 + 45*sqrt(5)) * Pi^4 / 18750.
 * @author Sean A. Irvine
 */
public class A347081 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A347081() {
    super(0, CR.PI.pow(4).multiply(CR.FIVE.sqrt().multiply(45).add(CR.valueOf(91))).divide(CR.valueOf(18750)));
  }
}

