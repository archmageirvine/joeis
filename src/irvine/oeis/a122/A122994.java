package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122994 a(n) = a(n-1)+9*a(n-2) initialized with a(0)=1, a(1)=3.
 * @author Sean A. Irvine
 */
public class A122994 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122994() {
    super(new long[] {9, 1}, new long[] {1, 3});
  }
}
