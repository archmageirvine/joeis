package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129345.
 * @author Sean A. Irvine
 */
public class A129345 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129345() {
    super(new long[] {-1, 0, 6, 0}, new long[] {2, 9, 12, 53});
  }
}
