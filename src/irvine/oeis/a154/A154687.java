package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154687 Period 6: repeat [1, 4, 7, 8, 5, 2].
 * @author Sean A. Irvine
 */
public class A154687 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154687() {
    super(new long[] {1, -1, 0, 1}, new long[] {1, 4, 7, 8});
  }
}
