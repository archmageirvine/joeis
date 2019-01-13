package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134175.
 * @author Sean A. Irvine
 */
public class A134175 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134175() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 0, 0, 384});
  }
}
