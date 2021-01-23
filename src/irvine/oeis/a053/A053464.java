package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053464 a(n) = n*5^(n-1).
 * @author Sean A. Irvine
 */
public class A053464 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053464() {
    super(new long[] {-25, 10}, new long[] {0, 1});
  }
}
