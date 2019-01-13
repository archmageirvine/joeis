package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101338.
 * @author Sean A. Irvine
 */
public class A101338 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101338() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 2, 4, 9, 20});
  }
}
