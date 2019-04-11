package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144534 Denominators of continued fraction convergents to <code>sqrt(8/9)</code>.
 * @author Sean A. Irvine
 */
public class A144534 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144534() {
    super(new long[] {-1, 0, 34, 0}, new long[] {1, 1, 17, 35});
  }
}
