package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161940 a(n) = ((3+sqrt(2))*(5+sqrt(2))^n + (3-sqrt(2))*(5-sqrt(2))^n)/2.
 * @author Sean A. Irvine
 */
public class A161940 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161940() {
    super(new long[] {-23, 10}, new long[] {3, 17});
  }
}
