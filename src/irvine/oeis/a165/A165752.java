package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165752.
 * @author Sean A. Irvine
 */
public class A165752 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165752() {
    super(new long[] {-4, 5}, new long[] {1, -4});
  }
}
