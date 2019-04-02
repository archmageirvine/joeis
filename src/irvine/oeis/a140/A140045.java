package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140045 Sequence generated from Z/6Z addition table considered as a matrix.
 * @author Sean A. Irvine
 */
public class A140045 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140045() {
    super(new long[] {19440, 5184, -2592, -576, 93, 12}, new long[] {1, 40, 495, 8616, 124011, 1905804});
  }
}
