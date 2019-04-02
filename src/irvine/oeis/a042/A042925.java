package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042925 Denominators of continued fraction convergents to sqrt(994).
 * @author Sean A. Irvine
 */
public class A042925 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042925() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 2270, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 17, 19, 36, 2251, 2287, 4538, 38591, 43129, 81720});
  }
}
