package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022153 Coordination sequence for root lattice <code>B_11</code>.
 * @author Sean A. Irvine
 */
public class A022153 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022153() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11},
      new long[] {242, 11242, 210474, 2224178, 15804866, 83999962, 358159802, 1285951458, 4025098770L, 11267030346L, 28752157898L},
      1);
  }
}
