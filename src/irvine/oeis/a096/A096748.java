package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096748 Expansion of (1+x)^2/(1-x^2-x^4).
 * @author Sean A. Irvine
 */
public class A096748 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096748() {
    super(new long[] {1, 0, 1, 0}, new long[] {1, 2, 2, 2});
  }
}
