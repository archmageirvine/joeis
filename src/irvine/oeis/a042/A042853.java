package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042853 Denominators of continued fraction convergents to <code>sqrt(957)</code>.
 * @author Sean A. Irvine
 */
public class A042853 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042853() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 29698, 0, 0, 0, 0, 0}, new long[] {1, 1, 15, 31, 449, 480, 29249, 29729, 445455, 920639, 13334401, 14255040});
  }
}
