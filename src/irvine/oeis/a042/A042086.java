package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042086 Numerators of continued fraction convergents to sqrt(567).
 * @author Sean A. Irvine
 */
public class A042086 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042086() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 4048, 0, 0, 0, 0, 0}, new long[] {23, 24, 119, 381, 1643, 2024, 94747, 96771, 481831, 1542264, 6650887, 8193151});
  }
}
