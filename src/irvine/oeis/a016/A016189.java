package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016189 a(n) = 10^n - 9^n.
 * @author Sean A. Irvine
 */
public class A016189 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016189() {
    super(new long[] {-90, 19}, new long[] {0, 1});
  }
}
