package irvine.oeis.a050;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A050621 Smallest n-digit number divisible by 2^n.
 * @author Sean A. Irvine
 */
public class A050621 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050621() {
    super(new long[] {-20, 12}, new long[] {2, 12});
  }
}
