package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199677 <code>8*9^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199677 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199677() {
    super(new long[] {-9, 10}, new long[] {9, 73});
  }
}
