package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228913 a(n) = 11^n-10*10^n+45*9^n-120*8^n+210*7^n-252*6^n+210*5^n-120*4^n+45*3^n-10*2^n+1.
 * @author Sean A. Irvine
 */
public class A228913 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228913() {
    super(new long[] {39916800, -120543840, 150917976, -105258076, 45995730, -13339535, 2637558, -357423, 32670, -1925, 66}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3628800});
  }
}
