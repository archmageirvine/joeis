package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118171.
 * @author Sean A. Irvine
 */
public class A118171 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118171() {
    super(new long[] {-16, 0, 17, 0}, new long[] {1, 7, 29, 115});
  }
}
