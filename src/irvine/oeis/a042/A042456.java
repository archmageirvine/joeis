package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042456.
 * @author Sean A. Irvine
 */
public class A042456 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042456() {
    super(new long[] {-1, 0, 110, 0}, new long[] {27, 55, 2997, 6049});
  }
}
