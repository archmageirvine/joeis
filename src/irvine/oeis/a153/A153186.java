package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153186 Period 9: repeat <code>1,7,4,7,4,7,1,1,1</code>.
 * @author Sean A. Irvine
 */
public class A153186 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153186() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 7, 4, 7, 4, 7, 1, 1, 1});
  }
}
