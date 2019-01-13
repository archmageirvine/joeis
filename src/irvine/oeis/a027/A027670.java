package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027670.
 * @author Sean A. Irvine
 */
public class A027670 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027670() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1, 13, 92, 430, 1505, 4291});
  }
}
