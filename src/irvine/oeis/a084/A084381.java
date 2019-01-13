package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084381.
 * @author Sean A. Irvine
 */
public class A084381 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084381() {
    super(new long[] {-1, 4, -6, 4}, new long[] {5, 6, 13, 32});
  }
}
