package irvine.oeis.a224;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A224790 a(n) = 3*9^n + 8.
 * @author Sean A. Irvine
 */
public class A224790 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224790() {
    super(new long[] {-9, 10}, new long[] {11, 35});
  }
}
