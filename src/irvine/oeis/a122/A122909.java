package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122909 F(n+1)F(2n+2)+F(n)F(2n).
 * @author Sean A. Irvine
 */
public class A122909 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122909() {
    super(new long[] {-1, -3, 6, 3}, new long[] {1, 4, 19, 79});
  }
}
