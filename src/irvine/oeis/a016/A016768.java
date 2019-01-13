package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016768.
 * @author Sean A. Irvine
 */
public class A016768 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016768() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 81, 1296, 6561, 20736});
  }
}
