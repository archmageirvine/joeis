package irvine.oeis.a347;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A347057 Decimal expansion of Pi^3 * (3*sqrt(2) + 4) / 256.
 * @author Sean A. Irvine
 */
public class A347057 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A347057() {
    super(0, CR.PI.pow(3).multiply(CR.SQRT2.multiply(CR.THREE).add(CR.FOUR)).divide(CR.valueOf(256)));
  }
}
