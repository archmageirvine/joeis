package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024075 a(n) = 7^n-1.
 * @author Sean A. Irvine
 */
public class A024075 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024075() {
    super(new long[] {-7, 8}, new long[] {0, 6});
  }
}
