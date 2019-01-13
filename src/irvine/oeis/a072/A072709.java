package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072709.
 * @author Sean A. Irvine
 */
public class A072709 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072709() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 1}, new long[] {14, 16, 17, 23, 34, 37, 43, 56, 74});
  }
}
