package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103770 A weighted tribonacci sequence, (1,3,9).
 * @author Sean A. Irvine
 */
public class A103770 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103770() {
    super(new long[] {9, 3, 1}, new long[] {1, 1, 4});
  }
}
