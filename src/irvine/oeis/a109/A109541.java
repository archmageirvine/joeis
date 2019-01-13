package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109541.
 * @author Sean A. Irvine
 */
public class A109541 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109541() {
    super(new long[] {1, 2, 1, 1, 1, 1, 0}, new long[] {1, 1, 1, 1, 1, 1, 1});
  }
}
