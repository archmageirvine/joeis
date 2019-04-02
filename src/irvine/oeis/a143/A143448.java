package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143448 Expansion of 1/(x^k*(1-x-2*x^(k+1))) for k=5.
 * @author Sean A. Irvine
 */
public class A143448 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143448() {
    super(new long[] {2, 0, 0, 0, 0, 1}, new long[] {1, 3, 5, 7, 9, 11});
  }
}
