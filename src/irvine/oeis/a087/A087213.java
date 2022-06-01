package irvine.oeis.a087;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A087213 Expansion of (1+x-4*x^2) / ((1+x)*(1-4*x^2)).
 * @author Sean A. Irvine
 */
public class A087213 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087213() {
    super(new long[] {4, 4, -1}, new long[] {1, 0, 0});
  }
}
