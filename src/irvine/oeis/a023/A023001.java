package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023001 a(n) = (8^n - 1)/7.
 * @author Sean A. Irvine
 */
public class A023001 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023001() {
    super(new long[] {-8, 9}, new long[] {0, 1});
  }
}
