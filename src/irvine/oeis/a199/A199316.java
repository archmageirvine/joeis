package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199316 11*5^n+1.
 * @author Sean A. Irvine
 */
public class A199316 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199316() {
    super(new long[] {-5, 6}, new long[] {12, 56});
  }
}
