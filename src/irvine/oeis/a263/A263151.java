package irvine.oeis.a263;
// manually 2023-10-12/simtraf at 2023-10-12

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A263151 Decimal expansion of the ratio of the length of the latus rectum arc of any parabola to its focal length: sqrt(8) + log(3 + sqrt(8)).
 * @author Georg Fischer
 */
public class A263151 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A263151() {
    super(1, CR.TWO.sqrt().add(CR.ONE.add(CR.TWO.sqrt()).log()).multiply(CR.TWO));
  }
}
