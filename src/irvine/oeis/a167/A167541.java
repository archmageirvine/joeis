package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167541.
 * @author Sean A. Irvine
 */
public class A167541 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167541() {
    super(new long[] {-1, 4, -6, 4}, new long[] {2, 5, 8, 10});
  }
}
