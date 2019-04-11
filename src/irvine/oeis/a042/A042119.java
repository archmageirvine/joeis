package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042119 Denominators of continued fraction convergents to <code>sqrt(584)</code>.
 * @author Sean A. Irvine
 */
public class A042119 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042119() {
    super(new long[] {-1, 0, 290, 0}, new long[] {1, 6, 289, 1740});
  }
}
