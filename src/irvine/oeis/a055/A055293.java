package irvine.oeis.a055;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A055293 Number of trees with n nodes and 6 leaves.
 * @author Georg Fischer
 */
public class A055293 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055293() {
    super(7, A055278.computeRecurrence(6), "1, 3, 9, 26, 66, 158, 350, 727, 1428, 2679, 4804, 8308, 13888, 22539, 35606, 54935, 82907, 122712, 178375, 255085, 359304, 499179, 684621, 927943, 1243918, 1650519", 0);
  }
}

