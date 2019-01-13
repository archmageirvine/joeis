package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037668.
 * @author Sean A. Irvine
 */
public class A037668 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037668() {
    super(new long[] {-5, 1, 0, 5}, new long[] {3, 17, 85, 428});
  }
}
