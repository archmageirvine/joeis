package irvine.oeis.a136;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A136376 a(n) = n*F(n) + (n-1)*F(n-1).
 * @author Sean A. Irvine
 */
public class A136376 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136376() {
    super(new long[] {-1, -2, 1, 2}, new long[] {1, 3, 8, 18});
  }
}
