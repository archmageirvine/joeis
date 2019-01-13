package irvine.oeis.a035;

import irvine.oeis.LinearRecurrence;

/**
 * A035289.
 * @author Sean A. Irvine
 */
public class A035289 extends LinearRecurrence {

  /** Construct the sequence. */
  public A035289() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 12, 56, 192, 504});
  }
}
