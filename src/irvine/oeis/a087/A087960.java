package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087960 a(n) = (-1)^binomial(n+1,2).
 * @author Sean A. Irvine
 */
public class A087960 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087960() {
    super(new long[] {-1, 0}, new long[] {1, -1});
  }
}
