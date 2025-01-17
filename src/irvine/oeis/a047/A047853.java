package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047853 a(n) = A047848(5, n).
 * @author Sean A. Irvine
 */
public class A047853 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047853() {
    super(new long[] {-8, 9}, new long[] {1, 2});
  }
}
