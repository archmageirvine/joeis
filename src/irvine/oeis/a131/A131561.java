package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131561 Period 3: repeat <code>[1, 1, -1]</code>.
 * @author Sean A. Irvine
 */
public class A131561 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131561() {
    super(new long[] {1, 0, 0}, new long[] {1, 1, -1});
  }
}
