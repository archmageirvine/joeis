package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109786 Expansion of -(x+2*x^2+3*x^3-1+5*x^4)/((x+1)*(x^2-3*x+1)*(1+x^2)).
 * @author Sean A. Irvine
 */
public class A109786 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109786() {
    super(new long[] {-1, 2, 1, 1, 2}, new long[] {1, 1, 1, 1, 1});
  }
}
