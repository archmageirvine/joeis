package irvine.oeis.a237;

import irvine.oeis.LinearRecurrence;

/**
 * A237420.
 * @author Sean A. Irvine
 */
public class A237420 extends LinearRecurrence {

  /** Construct the sequence. */
  public A237420() {
    super(new long[] {-1, 0, 2, 0}, new long[] {0, 0, 2, 0});
  }
}
