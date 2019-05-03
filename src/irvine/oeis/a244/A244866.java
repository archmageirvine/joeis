package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244866 Let G denote the <code>7-node, 12-edge</code> graph formed from a hexagon with main diagonals drawn and a node at the center; <code>a(n) =</code> number of magic labelings of G with magic sum <code>2n</code>.
 * @author Sean A. Irvine
 */
public class A244866 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244866() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 18, 114, 438, 1263, 3024});
  }
}
