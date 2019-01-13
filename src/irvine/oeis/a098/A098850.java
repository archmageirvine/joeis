package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098850.
 * @author Sean A. Irvine
 */
public class A098850 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098850() {
    super(new long[] {1, -3, 3}, new long[] {0, 19, 40});
  }
}
