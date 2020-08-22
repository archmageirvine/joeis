package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289414 a(n) = ((10-sqrt(10))^n + (10+sqrt(10))^n) / 2.
 * @author Sean A. Irvine
 */
public class A289414 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289414() {
    super(new long[] {-90, 20}, new long[] {1, 10});
  }
}
