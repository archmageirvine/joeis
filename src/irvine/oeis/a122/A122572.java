package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122572 a(1)=a(2)=1, a(n) = -14a(n-1) - a(n-2).
 * @author Sean A. Irvine
 */
public class A122572 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122572() {
    super(new long[] {-1, -14}, new long[] {1, 1});
  }
}
