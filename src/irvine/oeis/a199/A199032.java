package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199032 3*12^n-1.
 * @author Sean A. Irvine
 */
public class A199032 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199032() {
    super(new long[] {-12, 13}, new long[] {2, 35});
  }
}
