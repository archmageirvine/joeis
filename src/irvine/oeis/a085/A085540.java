package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085540 a(n) = n*(n+1)^3.
 * @author Sean A. Irvine
 */
public class A085540 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085540() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 8, 54, 192, 500});
  }
}
