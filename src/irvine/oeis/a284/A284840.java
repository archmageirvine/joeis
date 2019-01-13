package irvine.oeis.a284;

import irvine.oeis.LinearRecurrence;

/**
 * A284840.
 * @author Sean A. Irvine
 */
public class A284840 extends LinearRecurrence {

  /** Construct the sequence. */
  public A284840() {
    super(new long[] {1, -5, 8, -7, 5}, new long[] {1, 5, 18, 63, 224});
  }
}
