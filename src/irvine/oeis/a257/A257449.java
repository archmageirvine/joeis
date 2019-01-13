package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257449.
 * @author Sean A. Irvine
 */
public class A257449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257449() {
    super(new long[] {2, -9, 16, -14, 6}, new long[] {1, 17, 99, 373, 1115});
  }
}
