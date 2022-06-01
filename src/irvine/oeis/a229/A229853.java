package irvine.oeis.a229;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A229853 384*n + 1.
 * @author Sean A. Irvine
 */
public class A229853 extends LinearRecurrence {

  /** Construct the sequence. */
  public A229853() {
    super(new long[] {-1, 2}, new long[] {1, 385});
  }
}
