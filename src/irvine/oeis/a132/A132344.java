package irvine.oeis.a132;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A132344 a(n) = n*2^(floor(n/2)).
 * @author Sean A. Irvine
 */
public class A132344 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132344() {
    super(new long[] {-4, 0, 4, 0}, new long[] {0, 1, 4, 6});
  }
}
