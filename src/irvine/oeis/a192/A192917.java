package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192917.
 * @author Sean A. Irvine
 */
public class A192917 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192917() {
    super(new long[] {-1, 2, 2}, new long[] {0, 5, 6});
  }
}
