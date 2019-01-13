package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158064.
 * @author Sean A. Irvine
 */
public class A158064 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158064() {
    super(new long[] {1, -3, 3}, new long[] {38, 148, 330});
  }
}
