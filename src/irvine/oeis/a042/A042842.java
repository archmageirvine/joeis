package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042842 Numerators of continued fraction convergents to sqrt(952).
 * @author Sean A. Irvine
 */
public class A042842 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042842() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 23326, 0, 0, 0, 0, 0, 0, 0}, new long[] {30, 31, 185, 216, 1481, 1697, 9966, 11663, 709746, 721409, 4316791, 5038200, 34545991, 39584191, 232466946, 272051137});
  }
}
