package irvine.oeis.a203;

import irvine.oeis.LinearRecurrence;

/**
 * A203244 Second elementary symmetric function of the first n terms of <code>(1,4,16,64,256,...)</code>.
 * @author Sean A. Irvine
 */
public class A203244 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203244() {
    super(new long[] {64, -84, 21}, new long[] {4, 84, 1428});
  }
}
