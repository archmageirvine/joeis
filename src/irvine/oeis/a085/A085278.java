package irvine.oeis.a085;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A085278 Expansion of (1+2x)^2/((1-x^2)(1-2x)).
 * @author Sean A. Irvine
 */
public class A085278 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085278() {
    super(new long[] {-2, 1, 2}, new long[] {1, 6, 17});
  }
}
