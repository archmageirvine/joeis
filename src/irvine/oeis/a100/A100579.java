package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100579 Numerator of the best rational approximation to the decimal representation of the digital roots of m^n, m=1,2,..
 * @author Sean A. Irvine
 */
public class A100579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100579() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 125, 7, 49, 158, 17, 58, 2, 1});
  }
}
