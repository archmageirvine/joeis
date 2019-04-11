package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024077 <code>7^n - n^2</code>.
 * @author Sean A. Irvine
 */
public class A024077 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024077() {
    super(new long[] {-7, 22, -24, 10}, new long[] {1, 6, 45, 334});
  }
}
