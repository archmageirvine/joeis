package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199677 8*9^n+1.
 * @author Sean A. Irvine
 */
public class A199677 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199677() {
    super(new long[] {-9, 10}, new long[] {9, 73});
  }
}
