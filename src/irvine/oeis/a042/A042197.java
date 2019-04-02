package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042197 Denominators of continued fraction convergents to sqrt(623).
 * @author Sean A. Irvine
 */
public class A042197 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042197() {
    super(new long[] {-1, 0, 0, 0, 1248, 0, 0, 0}, new long[] {1, 1, 24, 25, 1224, 1249, 29951, 31200});
  }
}
