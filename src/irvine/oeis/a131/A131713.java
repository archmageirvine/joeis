package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131713 Period 3: repeat [1, -2, 1].
 * @author Sean A. Irvine
 */
public class A131713 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131713() {
    super(new long[] {-1, -1}, new long[] {1, -2});
  }
}
