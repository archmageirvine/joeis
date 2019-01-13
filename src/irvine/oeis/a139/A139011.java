package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139011.
 * @author Sean A. Irvine
 */
public class A139011 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139011() {
    super(new long[] {-5, 4}, new long[] {1, 2});
  }
}
