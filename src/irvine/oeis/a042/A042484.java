package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042484 Numerators of continued fraction convergents to <code>sqrt(770)</code>.
 * @author Sean A. Irvine
 */
public class A042484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042484() {
    super(new long[] {-1, 0, 0, 0, 222, 0, 0, 0}, new long[] {27, 28, 83, 111, 6077, 6188, 18453, 24641});
  }
}
