package irvine.oeis.a209;

import irvine.oeis.LinearRecurrence;

/**
 * A209262.
 * @author Sean A. Irvine
 */
public class A209262 extends LinearRecurrence {

  /** Construct the sequence. */
  public A209262() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 10, 97, 424, 1249});
  }
}
