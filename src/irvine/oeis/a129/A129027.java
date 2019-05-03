package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129027 Odd-indexed terms of <code>A129026</code>.
 * @author Sean A. Irvine
 */
public class A129027 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129027() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 108, 600, 1932, 4752});
  }
}
