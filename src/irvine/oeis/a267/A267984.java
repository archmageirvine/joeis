package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267984 Numbers congruent to <code>{17, 23} mod 30</code>.
 * @author Sean A. Irvine
 */
public class A267984 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267984() {
    super(new long[] {-1, 1, 1}, new long[] {17, 23, 47});
  }
}
