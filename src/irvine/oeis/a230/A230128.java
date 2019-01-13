package irvine.oeis.a230;

import irvine.oeis.LinearRecurrence;

/**
 * A230128.
 * @author Sean A. Irvine
 */
public class A230128 extends LinearRecurrence {

  /** Construct the sequence. */
  public A230128() {
    super(new long[] {-1, 0, 0, 1, 1, 0, 0}, new long[] {0, 0, 0, 0, 1, 1, 2});
  }
}
