package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251703.
 * @author Sean A. Irvine
 */
public class A251703 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251703() {
    super(new long[] {1, 1, 1, 1}, new long[] {1, 1, 0, 0});
  }
}
