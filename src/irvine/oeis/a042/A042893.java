package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042893 Denominators of continued fraction convergents to <code>sqrt(978)</code>.
 * @author Sean A. Irvine
 */
public class A042893 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042893() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 236674, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 3, 4, 7, 11, 337, 348, 685, 1033, 3784, 235641, 710707, 946348, 1657055, 2603403, 79759145, 82362548, 162121693, 244484241, 895574416});
  }
}
