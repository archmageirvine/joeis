package irvine.oeis.a284;

import irvine.oeis.LinearRecurrence;

/**
 * A284700.
 * @author Sean A. Irvine
 */
public class A284700 extends LinearRecurrence {

  /** Construct the sequence. */
  public A284700() {
    super(new long[] {-4, 1, 18, 13}, new long[] {4, 13, 205, 2902});
  }
}
