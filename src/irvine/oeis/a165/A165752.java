package irvine.oeis.a165;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A165752 a(n) = (8-5*4^n)/3.
 * @author Sean A. Irvine
 */
public class A165752 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165752() {
    super(new long[] {-4, 5}, new long[] {1, -4});
  }
}
