package irvine.oeis.a280;

import irvine.oeis.LinearRecurrence;

/**
 * A280181.
 * @author Sean A. Irvine
 */
public class A280181 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280181() {
    super(new long[] {1, -35, 35}, new long[] {1, 17, 561});
  }
}
