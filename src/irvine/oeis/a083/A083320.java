package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083320.
 * @author Sean A. Irvine
 */
public class A083320 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083320() {
    super(new long[] {60, -47, 12}, new long[] {1, 6, 32});
  }
}
