package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103889 Odd and even positive integers swapped.
 * @author Sean A. Irvine
 */
public class A103889 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103889() {
    super(new long[] {-1, 1, 1}, new long[] {2, 1, 4});
  }
}
