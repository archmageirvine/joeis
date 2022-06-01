package irvine.oeis.a144;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A144864 a(n) = (4*16^(n-1)-1)/3.
 * @author Sean A. Irvine
 */
public class A144864 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144864() {
    super(new long[] {-16, 17}, new long[] {1, 21});
  }
}
