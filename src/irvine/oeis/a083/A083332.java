package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083332.
 * @author Sean A. Irvine
 */
public class A083332 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083332() {
    super(new long[] {-16, 0, 10, 0}, new long[] {1, 5, 14, 34});
  }
}
