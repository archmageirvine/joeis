package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096025.
 * @author Sean A. Irvine
 */
public class A096025 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096025() {
    super(new long[] {-1, 1, 1}, new long[] {843, 1683, 3363});
  }
}
