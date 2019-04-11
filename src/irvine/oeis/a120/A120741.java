package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120741 <code>a(n) = (7^n - 1)/2</code>.
 * @author Sean A. Irvine
 */
public class A120741 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120741() {
    super(new long[] {-7, 8}, new long[] {0, 3});
  }
}
