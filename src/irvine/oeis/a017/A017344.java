package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017344 a(n) = (10*n + 6)^4.
 * @author Sean A. Irvine
 */
public class A017344 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017344() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1296, 65536, 456976, 1679616, 4477456});
  }
}
