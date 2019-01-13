package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247555.
 * @author Sean A. Irvine
 */
public class A247555 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247555() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {0, 1, 2, 4, 8, 3, 6, 12});
  }
}
