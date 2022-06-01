package irvine.oeis.a126;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A126646 a(n) = 2^(n+1) - 1.
 * @author Sean A. Irvine
 */
public class A126646 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126646() {
    super(new long[] {-2, 3}, new long[] {1, 3});
  }
}
