package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155603 a(n) = 5^n+3^n-1.
 * @author Sean A. Irvine
 */
public class A155603 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155603() {
    super(new long[] {15, -23, 9}, new long[] {1, 7, 33});
  }
}
