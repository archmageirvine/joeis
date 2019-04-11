package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017066 <code>a(n) = (8*n)^2</code>.
 * @author Sean A. Irvine
 */
public class A017066 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017066() {
    super(new long[] {1, -3, 3}, new long[] {0, 64, 256});
  }
}
