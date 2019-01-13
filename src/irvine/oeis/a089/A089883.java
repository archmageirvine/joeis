package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089883.
 * @author Sean A. Irvine
 */
public class A089883 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089883() {
    super(new long[] {-6, 23, -22, 8}, new long[] {1, 4, 16, 60});
  }
}
