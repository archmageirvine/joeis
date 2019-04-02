package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144704 a(n)=4^n*(1-2n).
 * @author Sean A. Irvine
 */
public class A144704 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144704() {
    super(new long[] {-16, 8}, new long[] {1, -4});
  }
}
