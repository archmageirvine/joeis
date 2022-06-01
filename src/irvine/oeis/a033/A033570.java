package irvine.oeis.a033;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A033570 Pentagonal numbers with odd index: a(n) = (2*n+1)*(3*n+1).
 * @author Sean A. Irvine
 */
public class A033570 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033570() {
    super(new long[] {1, -3, 3}, new long[] {1, 12, 35});
  }
}
