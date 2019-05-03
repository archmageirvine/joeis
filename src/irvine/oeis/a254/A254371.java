package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254371 Sum of cubes of the first n even numbers <code>(A016743)</code>.
 * @author Sean A. Irvine
 */
public class A254371 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254371() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 8, 72, 288, 800});
  }
}
