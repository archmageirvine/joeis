package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131534 Period 3: repeat [1, 2, 1].
 * @author Sean A. Irvine
 */
public class A131534 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131534() {
    super(new long[] {1, 0, 0}, new long[] {1, 2, 1});
  }
}
