package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080924 Jacobsthal gap sequence.
 * @author Sean A. Irvine
 */
public class A080924 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080924() {
    super(new long[] {4, 4, -1}, new long[] {0, 1, 3});
  }
}
