package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212592 <code>a(n)</code> is the difference between multiples of 7 with even and odd digit sum in base 6 in interval <code>[0,6^n)</code>.
 * @author Sean A. Irvine
 */
public class A212592 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212592() {
    super(new long[] {7, 0, -35, 0, 21, 0}, new long[] {1, 6, 11, 106, 201, 2022});
  }
}
