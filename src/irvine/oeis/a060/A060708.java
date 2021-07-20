package irvine.oeis.a060;
// manually (decexp) at 2021-07-13

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;
import irvine.oeis.PrependSequence;

/**
 * A060708 The Reuleaux Triangle constant.
 * @author Georg Fischer
 */
public class A060708 extends PrependSequence {

  /** Construct the sequence. */
  public A060708() {
    super(new DecimalExpansionSequence(1, CR.PI.subtract(CR.THREE.sqrt()).divide(CR.TWO), 10), 0);
  }
}
