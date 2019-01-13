package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096773.
 * @author Sean A. Irvine
 */
public class A096773 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096773() {
    super(new long[] {-4, 4, 1}, new long[] {0, 3, 1});
  }
}
