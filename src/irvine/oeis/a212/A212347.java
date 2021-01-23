package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212347 Sequence of coefficients of x^1 in marked mesh pattern generating function Q_{n,132}^(0,4,0,0)(x).
 * @author Sean A. Irvine
 */
public class A212347 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212347() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {14, 56, 144, 300, 550});
  }
}
