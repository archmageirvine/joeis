package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211387.
 * @author Sean A. Irvine
 */
public class A211387 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211387() {
    super(new long[] {-64, 512, -1712, 3216, -3804, 2984, -1581, 561, -128, 17}, new long[] {1, 2, 5, 17, 69, 286, 1137, 4277, 15247, 51786});
  }
}
