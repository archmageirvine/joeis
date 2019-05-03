package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108983 Inverse binomial transform of <code>A003950</code>.
 * @author Sean A. Irvine
 */
public class A108983 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108983() {
    super(new long[] {6, 5}, new long[] {1, 7});
  }
}
