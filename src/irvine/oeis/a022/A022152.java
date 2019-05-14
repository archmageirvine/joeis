package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022152 Coordination sequence for root lattice <code>B_10</code>.
 * @author Sean A. Irvine
 */
public class A022152 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022152() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {200, 7760, 122264, 1099040, 6728168, 31208560, 117555640, 376977472, 1064088840, 2708805776L}, 1);
  }
}
