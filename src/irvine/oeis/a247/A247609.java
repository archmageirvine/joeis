package irvine.oeis.a247;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A247609 a(n) = Sum_{k=0..4} binomial(8,k)*binomial(n,k).
 * @author Sean A. Irvine
 */
public class A247609 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247609() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 9, 45, 165, 495});
  }
}
