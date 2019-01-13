package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257845.
 * @author Sean A. Irvine
 */
public class A257845 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257845() {
    super(new long[] {-1, 0, 0, 0, 0, 2, 0, 0, 0, 0}, new long[] {0, 0, 0, 0, 0, 0, 1, 2, 3, 4});
  }
}
