package irvine.oeis.a132;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A132429 Period 4: repeat [3, 1, -1, -3].
 * @author Sean A. Irvine
 */
public class A132429 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132429() {
    super(new long[] {-1, -1, -1}, new long[] {3, 1, -1});
  }
}
