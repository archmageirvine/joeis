package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090390.
 * @author Sean A. Irvine
 */
public class A090390 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090390() {
    super(new long[] {-1, 5, 5}, new long[] {1, 1, 9});
  }
}
