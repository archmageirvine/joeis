package irvine.oeis.a258;

import irvine.oeis.LinearRecurrence;

/**
 * A258721 <code>a(n) = 24*n^2 + 52*n + 29</code>.
 * @author Sean A. Irvine
 */
public class A258721 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258721() {
    super(new long[] {1, -3, 3}, new long[] {29, 105, 229});
  }
}
