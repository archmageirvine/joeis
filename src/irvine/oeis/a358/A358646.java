package irvine.oeis.a358;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A358646 Decimal expansion of 3/4 + log(4).
 * @author Georg Fischer
 */
public class A358646 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A358646() {
    super(CR.THREE.divide(CR.FOUR).add(CR.FOUR.log()));
  }
}
