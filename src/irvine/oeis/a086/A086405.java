package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086405 Row T(n,3) of number array A086404.
 * @author Sean A. Irvine
 */
public class A086405 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086405() {
    super(new long[] {-6, 6}, new long[] {1, 4});
  }
}
