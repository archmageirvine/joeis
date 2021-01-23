package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131282 Period 6: repeat [1, 2, 3, 3, 4, 5].
 * @author Sean A. Irvine
 */
public class A131282 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131282() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 3, 4, 5});
  }
}
