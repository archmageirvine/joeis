package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156199 Period 12: repeat <code>1, 1, 4, 2, 4, 1, 1, 2, 7, 1, 7, 2 </code>.
 * @author Sean A. Irvine
 */
public class A156199 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156199() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 4, 2, 4, 1, 1, 2, 7, 1, 7, 2});
  }
}
