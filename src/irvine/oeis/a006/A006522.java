package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006522.
 * @author Sean A. Irvine
 */
public class A006522 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006522() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 0, 0, 1, 4});
  }
}
