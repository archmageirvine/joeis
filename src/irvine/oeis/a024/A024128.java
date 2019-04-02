package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024128 a(n) = 11^n - n.
 * @author Sean A. Irvine
 */
public class A024128 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024128() {
    super(new long[] {11, -23, 13}, new long[] {1, 10, 119});
  }
}
