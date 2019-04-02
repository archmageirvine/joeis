package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042503 Denominators of continued fraction convergents to sqrt(779).
 * @author Sean A. Irvine
 */
public class A042503 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042503() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 23570980, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 11, 56, 123, 3377, 6877, 37762, 384497, 422259, 23186483, 23608742, 259273903, 1319978257, 2899230417L, 79599199516L, 162097629449L, 890087346761L, 9062971097059L, 9953058443820L});
  }
}
