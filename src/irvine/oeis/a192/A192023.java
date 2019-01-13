package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192023.
 * @author Sean A. Irvine
 */
public class A192023 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192023() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 10, 31, 68});
  }
}
