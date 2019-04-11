package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017092 <code>a(n) = (8*n + 2)^4</code>.
 * @author Sean A. Irvine
 */
public class A017092 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017092() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {16, 10000, 104976, 456976, 1336336});
  }
}
