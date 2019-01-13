package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042108.
 * @author Sean A. Irvine
 */
public class A042108 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042108() {
    super(new long[] {-1, 0, 770, 0}, new long[] {24, 385, 18504, 296449});
  }
}
