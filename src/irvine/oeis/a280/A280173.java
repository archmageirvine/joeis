package irvine.oeis.a280;

import irvine.oeis.LinearRecurrence;

/**
 * A280173.
 * @author Sean A. Irvine
 */
public class A280173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280173() {
    super(new long[] {-2, 1, 2}, new long[] {1, 7, 10});
  }
}
