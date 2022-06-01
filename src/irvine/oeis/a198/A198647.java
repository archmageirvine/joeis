package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198647 3*7^n-1.
 * @author Sean A. Irvine
 */
public class A198647 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198647() {
    super(new long[] {-7, 8}, new long[] {2, 20});
  }
}
