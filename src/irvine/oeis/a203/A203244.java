package irvine.oeis.a203;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A203244 Second elementary symmetric function of the first n terms of (1,4,16,64,256,...).
 * @author Sean A. Irvine
 */
public class A203244 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203244() {
    super(new long[] {64, -84, 21}, new long[] {4, 84, 1428});
  }
}
