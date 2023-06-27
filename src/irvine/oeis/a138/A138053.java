package irvine.oeis.a138;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A138053 Expansion of -x^2*(19440*x^4+2160*x^3-2304*x^2-150*x+55) /((3*x+1)*(6*x-1)*(6*x+1)*(15*x-1)*(12*x^2-1)).
 * @author Sean A. Irvine
 */
public class A138053 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138053() {
    super(1, new long[] {19440, 5184, -2592, -576, 93, 12}, new long[] {0, 55, 510, 8931, 125082, 1914687});
  }
}
