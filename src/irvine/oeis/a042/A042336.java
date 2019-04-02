package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042336 Numerators of continued fraction convergents to sqrt(695).
 * @author Sean A. Irvine
 */
public class A042336 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042336() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 67278, 0, 0, 0, 0, 0, 0, 0}, new long[] {26, 53, 79, 290, 2979, 9227, 12206, 33639, 1761434, 3556507, 5317941, 19510330, 200421241, 620774053, 821195294, 2263164641L});
  }
}
