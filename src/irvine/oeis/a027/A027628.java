package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027628.
 * @author Sean A. Irvine
 */
public class A027628 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027628() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 96, 944, 4057, 11811});
  }
}
