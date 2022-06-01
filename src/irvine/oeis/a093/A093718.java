package irvine.oeis.a093;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A093718 a(n) = (n mod 3)^(n mod 2).
 * @author Sean A. Irvine
 */
public class A093718 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093718() {
    super(new long[] {1, -1, 1, -1, 1}, new long[] {1, 1, 1, 0, 1});
  }
}
