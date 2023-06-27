package irvine.oeis.a015;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A015222 Even square pyramidal numbers.
 * @author Sean A. Irvine
 */
public class A015222 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015222() {
    super(1, new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {14, 30, 140, 204, 506, 650, 1240});
  }
}
