package irvine.oeis.a347;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A347057 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A347057 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A347057() {
    super(CR.PI.pow(3).multiply(CR.SQRT2.multiply(CR.THREE).add(CR.FOUR)).divide(CR.valueOf(256)));
  }
}
