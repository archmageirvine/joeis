package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155637 10^n+5^n-1.
 * @author Sean A. Irvine
 */
public class A155637 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155637() {
    super(new long[] {50, -65, 16}, new long[] {1, 14, 124});
  }
}
