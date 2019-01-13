package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103321.
 * @author Sean A. Irvine
 */
public class A103321 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103321() {
    super(new long[] {-1, -1, -2, 1, 0, 2}, new long[] {1, 2, 4, 9, 18, 35});
  }
}
