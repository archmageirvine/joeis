package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042736 Numerators of continued fraction convergents to sqrt(898).
 * @author Sean A. Irvine
 */
public class A042736 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042736() {
    super(new long[] {-1, 0, 0, 0, 1798, 0, 0, 0}, new long[] {29, 30, 869, 899, 53011, 53910, 1562491, 1616401});
  }
}
