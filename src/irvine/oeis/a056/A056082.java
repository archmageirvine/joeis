package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056082 Numbers n such that <code>n^4 = 1 (mod 5^3)</code>.
 * @author Sean A. Irvine
 */
public class A056082 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056082() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 57, 68, 124, 126});
  }
}
