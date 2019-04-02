package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198859 2*9^n-1.
 * @author Sean A. Irvine
 */
public class A198859 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198859() {
    super(new long[] {-9, 10}, new long[] {1, 17});
  }
}
