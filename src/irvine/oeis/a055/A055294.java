package irvine.oeis.a055;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A055294 Number of trees with n nodes and 7 leaves.
 * @author Georg Fischer
 */
public class A055294 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055294() {
    super(8, A055278.computeRecurrence(7), "1, 3, 12, 39, 119, 325, 833, 1972, 4411, 9318, 18789, 36248, 67361, 120868, 210354, 355873, 587070, 946127, 1493015, 2310430, 3512236, 5251416, 7732998, 11226380, 16084556, 22762426, 31844621, 44072033, 60380915, 81940412, 110206450, 146973457, 194447287", 0);
  }
}

