package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042711 Denominators of continued fraction convergents to <code>sqrt(885)</code>.
 * @author Sean A. Irvine
 */
public class A042711 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042711() {
    super(new long[] {-1, 0, 0, 0, 238, 0, 0, 0}, new long[] {1, 1, 3, 4, 235, 239, 713, 952});
  }
}
