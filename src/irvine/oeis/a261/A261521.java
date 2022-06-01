package irvine.oeis.a261;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A261521 a(n) =  n^2 + 2*n + 29.
 * @author Sean A. Irvine
 */
public class A261521 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261521() {
    super(new long[] {1, -3, 3}, new long[] {29, 32, 37});
  }
}
