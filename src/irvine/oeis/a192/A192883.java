package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192883.
 * @author Sean A. Irvine
 */
public class A192883 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192883() {
    super(new long[] {-1, 2, 2}, new long[] {2, 0, 5});
  }
}
