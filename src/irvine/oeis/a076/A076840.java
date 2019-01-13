package irvine.oeis.a076;

import irvine.oeis.LinearRecurrence;

/**
 * A076840.
 * @author Sean A. Irvine
 */
public class A076840 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076840() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 5, 3, 2});
  }
}
