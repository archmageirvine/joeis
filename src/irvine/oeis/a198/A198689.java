package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198689 <code>8*7^n-1</code>.
 * @author Sean A. Irvine
 */
public class A198689 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198689() {
    super(new long[] {-7, 8}, new long[] {7, 55});
  }
}
