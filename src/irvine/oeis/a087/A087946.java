package irvine.oeis.a087;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A087946 Expansion of (1-3x+x^2)/((1-2x)(1-4x+x^2)).
 * @author Sean A. Irvine
 */
public class A087946 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087946() {
    super(new long[] {2, -9, 6}, new long[] {1, 3, 10});
  }
}
