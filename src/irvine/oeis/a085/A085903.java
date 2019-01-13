package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085903.
 * @author Sean A. Irvine
 */
public class A085903 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085903() {
    super(new long[] {-4, -2, 4, 1}, new long[] {1, 1, 7, 9});
  }
}
