package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016153 (9^n-4^n)/5.
 * @author Sean A. Irvine
 */
public class A016153 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016153() {
    super(new long[] {-36, 13}, new long[] {0, 1});
  }
}
