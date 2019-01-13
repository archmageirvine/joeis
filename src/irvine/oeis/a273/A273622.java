package irvine.oeis.a273;

import irvine.oeis.LinearRecurrence;

/**
 * A273622.
 * @author Sean A. Irvine
 */
public class A273622 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273622() {
    super(new long[] {-1, -5, -2, 5}, new long[] {1, 5, 24, 105});
  }
}
