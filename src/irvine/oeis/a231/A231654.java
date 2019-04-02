package irvine.oeis.a231;

import irvine.oeis.LinearRecurrence;

/**
 * A231654 Number of non-equivalent ways to choose 5 points in an equilateral triangle grid of side n.
 * @author Sean A. Irvine
 */
public class A231654 extends LinearRecurrence {

  /** Construct the sequence. */
  public A231654() {
    super(new long[] {1, -6, 10, 10, -50, 34, 66, -110, 0, 110, -66, -34, 50, -10, -10, 6}, new long[] {0, 0, 2, 48, 526, 3450, 16536, 63104, 204202, 580669, 1491096, 3520768, 7754502, 16098425, 31770760, 59998736});
  }
}
