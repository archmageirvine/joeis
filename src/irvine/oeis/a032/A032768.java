package irvine.oeis.a032;

import irvine.oeis.LinearRecurrence;

/**
 * A032768.
 * @author Sean A. Irvine
 */
public class A032768 extends LinearRecurrence {

  /** Construct the sequence. */
  public A032768() {
    super(new long[] {1, -4, 6, -4, 1, -1, 4, -6, 4}, new long[] {0, 8, 36, 100, 224, 432, 756, 1232, 1900});
  }
}
