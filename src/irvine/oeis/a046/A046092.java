package irvine.oeis.a046;

import irvine.oeis.LinearRecurrence;

/**
 * A046092.
 * @author Sean A. Irvine
 */
public class A046092 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046092() {
    super(new long[] {1, -3, 3}, new long[] {0, 4, 12});
  }
}
