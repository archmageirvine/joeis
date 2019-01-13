package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192969.
 * @author Sean A. Irvine
 */
public class A192969 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192969() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, 2, 6, 12});
  }
}
