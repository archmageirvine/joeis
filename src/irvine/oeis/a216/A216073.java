package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216073.
 * @author Sean A. Irvine
 */
public class A216073 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216073() {
    super(new long[] {-1, 0, 10, 0}, new long[] {1, 7, 17, 71});
  }
}
