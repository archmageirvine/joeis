package irvine.oeis.a229;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A229855 a(n) = 384*n + 257.
 * @author Sean A. Irvine
 */
public class A229855 extends LinearRecurrence {

  /** Construct the sequence. */
  public A229855() {
    super(new long[] {-1, 2}, new long[] {257, 641});
  }
}
