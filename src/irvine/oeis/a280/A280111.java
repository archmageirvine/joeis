package irvine.oeis.a280;

import irvine.oeis.LinearRecurrence;

/**
 * A280111.
 * @author Sean A. Irvine
 */
public class A280111 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280111() {
    super(new long[] {1, -39, 39}, new long[] {1, 58, 2221});
  }
}
