package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192973.
 * @author Sean A. Irvine
 */
public class A192973 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192973() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, 3, 10, 23});
  }
}
