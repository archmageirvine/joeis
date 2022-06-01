package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199212 a(n) = 2*5^n+1.
 * @author Sean A. Irvine
 */
public class A199212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199212() {
    super(new long[] {-5, 6}, new long[] {3, 11});
  }
}
