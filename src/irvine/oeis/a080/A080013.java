package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080013.
 * @author Sean A. Irvine
 */
public class A080013 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080013() {
    super(new long[] {-1, 0, 1, 1, 1, 0}, new long[] {1, 0, 0, 1, 1, 1});
  }
}
