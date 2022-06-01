package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017068 a(n) = (8*n)^4.
 * @author Sean A. Irvine
 */
public class A017068 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017068() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 4096, 65536, 331776, 1048576});
  }
}
