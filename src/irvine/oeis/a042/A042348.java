package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042348 Numerators of continued fraction convergents to sqrt(701).
 * @author Sean A. Irvine
 */
public class A042348 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042348() {
    super(new long[] {1, 0, 0, 0, 0, 23564, 0, 0, 0, 0}, new long[] {26, 53, 556, 5613, 11782, 618277, 1248336, 13101637, 132264706, 277631049});
  }
}
