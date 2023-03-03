package irvine.oeis.a134;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134450 a(n) = square root of the square part of discriminant of Brioschi quintic polynomial x^5-10*n*x^3+45*n^2*x-n^2.
 * @author Sean A. Irvine
 */
public class A134450 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134450() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {43175, 1382000, 10495575, 44230400, 134984375, 335890800});
  }
}
