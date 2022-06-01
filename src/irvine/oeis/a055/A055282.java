package irvine.oeis.a055;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A055282 Number of rooted trees with n nodes and 7 leaves.
 * @author Georg Fischer
 */
public class A055282 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055282() {
    super(8, A055278.computeRecurrence(7), "1, 7, 40, 185, 732, 2544, 7949, 22668, 59773, 147228, 341653, 752182, 1580470, 3185224, 6183637, 11606151, 21127675, 37405050, 64561161, 108866382, 179684155, 290762751, 461978659, 721658992, 1109643254, 1681275261, 2512561363, 3706772370, 5402827325, 7785852189, 11100386299, 15666780914, 21901437438", 0);
  }
}

