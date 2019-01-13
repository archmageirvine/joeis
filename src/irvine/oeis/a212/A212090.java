package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212090.
 * @author Sean A. Irvine
 */
public class A212090 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212090() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 16, 80, 251});
  }
}
