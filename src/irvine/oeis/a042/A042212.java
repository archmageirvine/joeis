package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042212 Numerators of continued fraction convergents to sqrt(632).
 * @author Sean A. Irvine
 */
public class A042212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042212() {
    super(new long[] {-1, 0, 0, 0, 15486, 0, 0, 0}, new long[] {25, 176, 1081, 7743, 388231, 2725360, 16740391, 119908097});
  }
}
