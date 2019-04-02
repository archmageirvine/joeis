package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042260 Numerators of continued fraction convergents to sqrt(656).
 * @author Sean A. Irvine
 */
public class A042260 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042260() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4098, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {25, 26, 51, 77, 128, 333, 461, 794, 1255, 2049, 103705, 105754, 209459, 315213, 524672, 1364557, 1889229, 3253786, 5143015, 8396801});
  }
}
