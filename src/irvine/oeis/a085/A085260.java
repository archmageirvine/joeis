package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085260.
 * @author Sean A. Irvine
 */
public class A085260 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085260() {
    super(new long[] {-1, 13}, new long[] {1, 12});
  }
}
