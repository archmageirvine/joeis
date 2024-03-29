package irvine.oeis.a324;
// Generated by gen_seq4.pl decexp at 2021-07-16 22:36

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A324559 Decimal expansion of the probability that the length of a chord drawn through 2 points taken at random within a circle on each side of a given diameter will be less than the radius.
 * Formula: 13/144-13*sqrt(3)/(48*Pi)+3*(3+log(4/3))/(16*Pi^2)
 * @author Georg Fischer
 */
public class A324559 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A324559() {
    super(-2, CR.valueOf(13).divide(CR.valueOf(144)).subtract(CR.valueOf(13).multiply(CR.THREE.sqrt()).divide(CR.valueOf(48).multiply(CR.PI))).add(CR.THREE.multiply(CR.THREE.add(CR.FOUR.divide(CR.THREE).log())).divide(CR.valueOf(16).multiply(CR.PI.pow(CR.TWO)))));
  }
}
