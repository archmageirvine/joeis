package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199214 3*5^n+1.
 * @author Sean A. Irvine
 */
public class A199214 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199214() {
    super(new long[] {-5, 6}, new long[] {4, 16});
  }
}
