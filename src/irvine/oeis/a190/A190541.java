package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190541 <code>7^n - 3^n</code>.
 * @author Sean A. Irvine
 */
public class A190541 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190541() {
    super(new long[] {-21, 10}, new long[] {0, 4});
  }
}
