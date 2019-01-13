package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172252.
 * @author Sean A. Irvine
 */
public class A172252 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172252() {
    super(new long[] {-2, 3}, new long[] {-1, 7});
  }
}
