package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143375 Expansion of x / ( 1 -x^2 -2*x^5 -x^8 -x^10 -x^12 ).
 * @author Sean A. Irvine
 */
public class A143375 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143375() {
    super(new long[] {1, 0, 1, 0, 1, 0, 0, 2, 0, 0, 1, 0}, new long[] {1, 0, 1, 0, 1, 2, 1, 4, 2, 6, 8, 8});
  }
}
