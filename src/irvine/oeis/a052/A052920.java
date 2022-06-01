package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052920 a(n) = a(n-3) + a(n-5) with initial values 1,0,0,1,0.
 * @author Sean A. Irvine
 */
public class A052920 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052920() {
    super(new long[] {1, 0, 1, 0, 0}, new long[] {1, 0, 0, 1, 0});
  }
}
