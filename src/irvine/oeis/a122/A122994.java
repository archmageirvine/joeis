package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122994 <code>a(n) = a(n-1)+9*a(n-2)</code> initialized with <code>a(0)=1, a(1)=3</code>.
 * @author Sean A. Irvine
 */
public class A122994 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122994() {
    super(new long[] {9, 1}, new long[] {1, 3});
  }
}
