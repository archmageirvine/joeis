package irvine.oeis.a280;

import irvine.oeis.LinearRecurrence;

/**
 * A280112.
 * @author Sean A. Irvine
 */
public class A280112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280112() {
    super(new long[] {1, -39, 39}, new long[] {1, 19, 703});
  }
}
