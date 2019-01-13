package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037542.
 * @author Sean A. Irvine
 */
public class A037542 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037542() {
    super(new long[] {-9, 1, 0, 9}, new long[] {1, 11, 100, 901});
  }
}
