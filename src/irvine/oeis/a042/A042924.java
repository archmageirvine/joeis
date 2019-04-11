package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042924 Numerators of continued fraction convergents to <code>sqrt(994)</code>.
 * @author Sean A. Irvine
 */
public class A042924 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042924() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 2270, 0, 0, 0, 0, 0}, new long[] {31, 32, 63, 536, 599, 1135, 70969, 72104, 143073, 1216688, 1359761, 2576449});
  }
}
