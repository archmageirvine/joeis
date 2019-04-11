package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024023 <code>a(n) = 3^n - 1</code>.
 * @author Sean A. Irvine
 */
public class A024023 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024023() {
    super(new long[] {-3, 4}, new long[] {0, 2});
  }
}
