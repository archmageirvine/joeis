package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028177.
 * @author Sean A. Irvine
 */
public class A028177 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028177() {
    super(new long[] {-3300, 1840, -371, 32}, new long[] {1, 32, 653, 10864});
  }
}
