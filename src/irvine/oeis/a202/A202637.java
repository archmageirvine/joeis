package irvine.oeis.a202;

import irvine.oeis.LinearRecurrence;

/**
 * A202637.
 * @author Sean A. Irvine
 */
public class A202637 extends LinearRecurrence {

  /** Construct the sequence. */
  public A202637() {
    super(new long[] {-1, 0, 16, 0}, new long[] {2, 5, 37, 82});
  }
}
