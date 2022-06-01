package irvine.oeis.a050;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A050916 a(n) = n*5^n + 1.
 * @author Sean A. Irvine
 */
public class A050916 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050916() {
    super(new long[] {25, -35, 11}, new long[] {1, 6, 51});
  }
}
