package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038166 G.f.: 1/((1-x)*(1-x^2))^6.
 * @author Sean A. Irvine
 */
public class A038166 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038166() {
    super(new long[] {-1, 6, -9, -16, 60, -24, -116, 144, 66, -220, 66, 144, -116, -24, 60, -16, -9, 6}, new long[] {1, 6, 27, 92, 273, 714, 1715, 3816, 8007, 15938, 30381, 55692, 98735, 169806, 284349, 464672, 742950, 1164228});
  }
}
