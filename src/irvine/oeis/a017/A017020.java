package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017020 a(n) = (7*n + 3)^4.
 * @author Sean A. Irvine
 */
public class A017020 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017020() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {81, 10000, 83521, 331776, 923521});
  }
}
