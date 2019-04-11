package irvine.oeis.a050;

import irvine.oeis.LinearRecurrence;

/**
 * A050621 Smallest n-digit number divisible by <code>2^n</code>.
 * @author Sean A. Irvine
 */
public class A050621 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050621() {
    super(new long[] {-20, 12}, new long[] {2, 12});
  }
}
