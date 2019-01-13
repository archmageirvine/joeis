package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072221.
 * @author Sean A. Irvine
 */
public class A072221 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072221() {
    super(new long[] {1, -7, 7}, new long[] {1, 4, 25});
  }
}
