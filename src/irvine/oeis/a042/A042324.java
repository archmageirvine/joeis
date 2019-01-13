package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042324.
 * @author Sean A. Irvine
 */
public class A042324 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042324() {
    super(new long[] {-1, 0, 210, 0}, new long[] {26, 105, 5486, 22049});
  }
}
