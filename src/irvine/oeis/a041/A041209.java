package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041209 Denominators of continued fraction convergents to sqrt(115).
 * @author Sean A. Irvine
 */
public class A041209 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041209() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2252, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, 4, 7, 11, 18, 29, 76, 105, 2176, 2281, 6738, 9019, 15757, 24776, 40533, 65309, 171151, 236460});
  }
}
