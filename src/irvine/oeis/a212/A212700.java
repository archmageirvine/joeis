package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212700 a(n) = 5*n*6^(n-1).
 * @author Sean A. Irvine
 */
public class A212700 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212700() {
    super(new long[] {-36, 12}, new long[] {5, 60});
  }
}
