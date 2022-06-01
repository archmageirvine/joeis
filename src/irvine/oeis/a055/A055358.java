package irvine.oeis.a055;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A055358 Number of increasing mobiles (circular rooted trees) with n nodes and 4 leaves.
 * @author Georg Fischer
 */
public class A055358 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055358() {
    super(5, A055357.computeRecurrence(4), "6, 96, 874, 6040, 35458, 187288, 920350, 4297240, 19332662, 84615152, 362772194, 1531122296, 6385177274, 26382771464");
  }
}

