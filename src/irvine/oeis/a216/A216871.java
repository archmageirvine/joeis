package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216871.
 * @author Sean A. Irvine
 */
public class A216871 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216871() {
    super(new long[] {1, -2, 0, 2}, new long[] {-4, 4, -4, 20});
  }
}
