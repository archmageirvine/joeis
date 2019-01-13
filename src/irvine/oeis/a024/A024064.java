package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024064.
 * @author Sean A. Irvine
 */
public class A024064 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024064() {
    super(new long[] {-6, 19, -21, 9}, new long[] {1, 5, 32, 207});
  }
}
