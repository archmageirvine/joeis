package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192816.
 * @author Sean A. Irvine
 */
public class A192816 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192816() {
    super(new long[] {7, -3, 5}, new long[] {0, 1, 2});
  }
}
