package irvine.oeis.a060;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A060589 a(n) = 2*(2^n-1)*3^(n-1).
 * @author Sean A. Irvine
 */
public class A060589 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060589() {
    super(new long[] {-18, 9}, new long[] {0, 2});
  }
}
