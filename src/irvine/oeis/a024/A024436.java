package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024436.
 * @author Sean A. Irvine
 */
public class A024436 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024436() {
    super(new long[] {-792, 1062, -299, 30}, new long[] {1, 30, 601, 10122});
  }
}
