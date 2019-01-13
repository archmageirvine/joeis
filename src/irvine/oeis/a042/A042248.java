package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042248.
 * @author Sean A. Irvine
 */
public class A042248 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042248() {
    super(new long[] {-1, 0, 102, 0}, new long[] {25, 51, 2575, 5201});
  }
}
