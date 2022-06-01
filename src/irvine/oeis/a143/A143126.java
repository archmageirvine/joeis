package irvine.oeis.a143;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A143126 a(n) = (1-2n)*2^n.
 * @author Sean A. Irvine
 */
public class A143126 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143126() {
    super(new long[] {-4, 4}, new long[] {1, -2});
  }
}
