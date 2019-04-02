package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084968 Multiples of 7 coprime to 30.
 * @author Sean A. Irvine
 */
public class A084968 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084968() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 1}, new long[] {7, 49, 77, 91, 119, 133, 161, 203, 217});
  }
}
