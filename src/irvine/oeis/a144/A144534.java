package irvine.oeis.a144;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A144534 Denominators of continued fraction convergents to sqrt(8/9).
 * @author Sean A. Irvine
 */
public class A144534 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144534() {
    super(new long[] {-1, 0, 34, 0}, new long[] {1, 1, 17, 35});
  }
}
