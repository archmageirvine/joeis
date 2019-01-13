package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257708.
 * @author Sean A. Irvine
 */
public class A257708 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257708() {
    super(new long[] {1, -1, -6, 6, 1}, new long[] {25, 55, 208, 382, 1273});
  }
}
