package irvine.oeis.a231;

import irvine.oeis.LinearRecurrence;

/**
 * A231101.
 * @author Sean A. Irvine
 */
public class A231101 extends LinearRecurrence {

  /** Construct the sequence. */
  public A231101() {
    super(new long[] {3, 1, 0}, new long[] {3, 0, 2});
  }
}
