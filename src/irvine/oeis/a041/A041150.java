package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041150 Numerators of continued fraction convergents to sqrt(85).
 * @author Sean A. Irvine
 */
public class A041150 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041150() {
    super(new long[] {1, 0, 0, 0, 0, 756, 0, 0, 0, 0}, new long[] {9, 37, 46, 83, 378, 6887, 27926, 34813, 62739, 285769});
  }
}
