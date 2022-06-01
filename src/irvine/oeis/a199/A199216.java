package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199216 6*5^n+1.
 * @author Sean A. Irvine
 */
public class A199216 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199216() {
    super(new long[] {-5, 6}, new long[] {7, 31});
  }
}
