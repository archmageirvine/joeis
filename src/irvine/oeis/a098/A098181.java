package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098181 Odd numbers with two times the positive even numbers repeated in order between them.
 * @author Sean A. Irvine
 */
public class A098181 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098181() {
    super(new long[] {-1, 2, -2, 2}, new long[] {1, 3, 4, 4});
  }
}
