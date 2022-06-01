package irvine.oeis.a109;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A109610 Expansion of (1+3*x^4-2*x^7+x^10-x^12)/((x+1)*(x^2+1)*(x^2+x+1)*(x^2-x+1)*(x^4-x^2+1)*(x-1)^2).
 * @author Sean A. Irvine
 */
public class A109610 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109610() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 4, 4, 4, 2, 2, 2, 3, 3, 3});
  }
}
