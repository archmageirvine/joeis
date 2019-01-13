package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085250.
 * @author Sean A. Irvine
 */
public class A085250 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085250() {
    super(new long[] {1, -3, 3}, new long[] {0, 4, 24});
  }
}
