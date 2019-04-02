package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017173 a(n) = 9*n + 1.
 * @author Sean A. Irvine
 */
public class A017173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017173() {
    super(new long[] {-1, 2}, new long[] {1, 10});
  }
}
