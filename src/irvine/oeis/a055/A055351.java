package irvine.oeis.a055;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A055351 Number of labeled mobiles (circular rooted trees) with n nodes and 4 leaves.
 * @author Georg Fischer
 */
public class A055351 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055351() {
    super(5, A055350.computeRecurrence(4), "30, 1500, 47250, 1234800, 29635200, 685843200, 15717240000, 362244960000");
    setGfType(1);
  }
}

