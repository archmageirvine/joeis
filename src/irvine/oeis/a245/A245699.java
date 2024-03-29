package irvine.oeis.a245;
// Generated by gen_seq4.pl decexp at 2021-07-25 17:16

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A245699 Decimal expansion of the expected distance from a randomly selected point in a 45-45-90 degree triangle of base length 1 to the vertex of the right angle: (4+sqrt(2)*log(3+2*sqrt(2)))/12.
 * Formula: (4+sqrt(2)*log(3+2*sqrt(2)))/12
 * @author Georg Fischer
 */
public class A245699 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A245699() {
    super(0, CR.FOUR.add(CR.TWO.sqrt().multiply(CR.THREE.add(CR.TWO.multiply(CR.TWO.sqrt())).log())).divide(CR.valueOf(12)));
  }
}
