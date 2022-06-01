package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199411 8*6^n+1.
 * @author Sean A. Irvine
 */
public class A199411 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199411() {
    super(new long[] {-6, 7}, new long[] {9, 49});
  }
}
