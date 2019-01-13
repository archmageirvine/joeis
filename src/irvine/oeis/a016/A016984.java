package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016984.
 * @author Sean A. Irvine
 */
public class A016984 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016984() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 2401, 38416, 194481, 614656});
  }
}
