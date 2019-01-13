package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123752.
 * @author Sean A. Irvine
 */
public class A123752 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123752() {
    super(new long[] {7, 0}, new long[] {1, 2});
  }
}
