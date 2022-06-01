package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155631 10^n-4^n+1^n.
 * @author Sean A. Irvine
 */
public class A155631 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155631() {
    super(new long[] {40, -54, 15}, new long[] {1, 7, 85});
  }
}
