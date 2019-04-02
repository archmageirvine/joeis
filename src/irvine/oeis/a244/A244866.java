package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244866 Let G denote the 7-node, 12-edge graph formed from a hexagon with main diagonals drawn and a node at the center; a(n) = number of magic labelings of G with magic sum 2n.
 * @author Sean A. Irvine
 */
public class A244866 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244866() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 18, 114, 438, 1263, 3024});
  }
}
