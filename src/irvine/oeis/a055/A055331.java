package irvine.oeis.a055;

import irvine.oeis.HolonomicRecurrence;

/**
 * A055331 Number of rooted identity trees with n nodes and 6 leaves.
 * @author Georg Fischer
 */
public class A055331 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055331() {
    super(7, A055278.computeRecurrence(6), "6, 61, 329, 1289, 4133, 11462, 28536, 65194, 138956, 279457, 535131, 982224, 1737756, 2976311, 4953198, 8033628, 12731680, 19758178, 30083086, 45010674, 66275305, 96155116, 137614204, 194469039, 271593493, 375156018", 0);
  }
}

