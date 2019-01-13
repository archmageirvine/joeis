package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131090.
 * @author Sean A. Irvine
 */
public class A131090 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131090() {
    super(new long[] {2, -1, 0, 2}, new long[] {0, 1, 0, 1});
  }
}
