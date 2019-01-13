package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192971.
 * @author Sean A. Irvine
 */
public class A192971 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192971() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, 2, 9, 21});
  }
}
