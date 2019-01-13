package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212668.
 * @author Sean A. Irvine
 */
public class A212668 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212668() {
    super(new long[] {-1, 4, -6, 4}, new long[] {9, 65, 201, 449});
  }
}
