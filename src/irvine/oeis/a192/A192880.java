package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192880.
 * @author Sean A. Irvine
 */
public class A192880 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192880() {
    super(new long[] {-1, 2, 7, 2}, new long[] {1, 0, 3, 7});
  }
}
