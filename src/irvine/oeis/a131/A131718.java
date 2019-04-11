package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131718 Period 6: repeat <code>[1, 1, 2, 1, 2, 1]</code>.
 * @author Sean A. Irvine
 */
public class A131718 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131718() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 1, 2, 1});
  }
}
