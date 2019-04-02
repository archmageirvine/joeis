package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042200 Numerators of continued fraction convergents to sqrt(626).
 * @author Sean A. Irvine
 */
public class A042200 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042200() {
    super(new long[] {1, 50}, new long[] {25, 1251});
  }
}
