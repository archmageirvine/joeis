package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277669.
 * @author Sean A. Irvine
 */
public class A277669 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277669() {
    super(new long[] {-1, 2, -3, 4, -5, 6}, new long[] {1, 6, 31, 160, 826, 4264});
  }
}
