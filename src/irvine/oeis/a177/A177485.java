package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177485 G.f.: (1+x+x^3+x^5)/( (1-x^2+x^3)*(1-x-x^3) ).
 * @author Sean A. Irvine
 */
public class A177485 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177485() {
    super(new long[] {1, -1, 1, -1, 1, 1}, new long[] {1, 2, 3, 5, 7, 11});
  }
}
