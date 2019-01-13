package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037777.
 * @author Sean A. Irvine
 */
public class A037777 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037777() {
    super(new long[] {-9, 10, -10, 10}, new long[] {3, 28, 252, 2270});
  }
}
