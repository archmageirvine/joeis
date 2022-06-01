package irvine.oeis.a244;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A244867 Let G denote the 9-node, 16-edge graph formed from an octagon with main diagonals drawn and a node at the center; a(n) = number of magic labelings of G with magic sum 2n.
 * @author Sean A. Irvine
 */
public class A244867 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244867() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 32, 320, 1784, 7040, 22104, 58980, 139320});
  }
}
