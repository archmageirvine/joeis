package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156712 Star numbers <code>(A003154)</code> that are also triangular numbers <code>(A000217)</code>.
 * @author Sean A. Irvine
 */
public class A156712 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156712() {
    super(new long[] {1, -15, 15}, new long[] {1, 7, 91});
  }
}
