package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117652.
 * @author Sean A. Irvine
 */
public class A117652 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117652() {
    super(new long[] {1, -4, 5, 0, -4, 0, 4, 0, -4, 0, 4, 0, -4, 0, 4, 0, -5, 4}, new long[] {0, -1, -1, -2, -2, -2, 0, 3, 10, 20, 35, 55, 84, 120, 168, 227, 300, 388});
  }
}
