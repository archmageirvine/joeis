package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084641.
 * @author Sean A. Irvine
 */
public class A084641 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084641() {
    super(new long[] {-256, 1024, -1792, 1792, -1120, 448, -112, 16}, new long[] {0, 1, 130, 2574, 25904, 183200, 1040112, 5076400});
  }
}
