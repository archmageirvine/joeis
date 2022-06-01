package irvine.oeis.a193;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A193941 G.f.: (1+x^3)/(1-x-x^6).
 * @author Sean A. Irvine
 */
public class A193941 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193941() {
    super(new long[] {1, 0, 0, 0, 0, 1}, new long[] {1, 1, 1, 2, 2, 2});
  }
}
