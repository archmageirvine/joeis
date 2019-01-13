package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085697.
 * @author Sean A. Irvine
 */
public class A085697 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085697() {
    super(new long[] {-1, 0, -1, 6, 3, 2}, new long[] {1, 1, 4, 16, 49, 169});
  }
}
