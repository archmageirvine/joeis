package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291337.
 * @author Sean A. Irvine
 */
public class A291337 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291337() {
    super(new long[] {5, -7, 5}, new long[] {1, 3, 10});
  }
}
