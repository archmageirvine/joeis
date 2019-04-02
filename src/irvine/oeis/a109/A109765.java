package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109765 Expansion of x/((4*x-1)*(2*x-1)*(x+1)).
 * @author Sean A. Irvine
 */
public class A109765 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109765() {
    super(new long[] {-8, -2, 5}, new long[] {0, 1, 5});
  }
}
