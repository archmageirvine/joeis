package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042425 Denominators of continued fraction convergents to sqrt(740).
 * @author Sean A. Irvine
 */
public class A042425 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042425() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 18498, 0, 0, 0, 0, 0}, new long[] {1, 4, 5, 64, 69, 340, 18429, 74056, 92485, 1183876, 1276361, 6289320});
  }
}
