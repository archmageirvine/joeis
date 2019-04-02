package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017212 a(n) = (9*n + 4)^4.
 * @author Sean A. Irvine
 */
public class A017212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017212() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {256, 28561, 234256, 923521, 2560000});
  }
}
