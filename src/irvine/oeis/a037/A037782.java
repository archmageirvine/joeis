package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037782.
 * @author Sean A. Irvine
 */
public class A037782 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037782() {
    super(new long[] {-7, 1, 0, 0, 7}, new long[] {3, 22, 156, 1092, 7647});
  }
}
