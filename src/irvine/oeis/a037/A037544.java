package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037544.
 * @author Sean A. Irvine
 */
public class A037544 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037544() {
    super(new long[] {-3, 1, 0, 3}, new long[] {1, 5, 17, 52});
  }
}
