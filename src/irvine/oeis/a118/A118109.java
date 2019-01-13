package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118109.
 * @author Sean A. Irvine
 */
public class A118109 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118109() {
    super(new long[] {-10000, 0, 10001, 0}, new long[] {1, 111, 10001, 1110111});
  }
}
