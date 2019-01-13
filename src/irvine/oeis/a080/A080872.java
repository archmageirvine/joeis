package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080872.
 * @author Sean A. Irvine
 */
public class A080872 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080872() {
    super(new long[] {-1, 0, 10, 0}, new long[] {1, 1, 5, 9});
  }
}
