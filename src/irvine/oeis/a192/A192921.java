package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192921.
 * @author Sean A. Irvine
 */
public class A192921 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192921() {
    super(new long[] {-1, 2, 2}, new long[] {1, 2, 2});
  }
}
