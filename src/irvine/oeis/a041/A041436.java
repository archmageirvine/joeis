package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041436 Numerators of continued fraction convergents to sqrt(234).
 * @author Sean A. Irvine
 */
public class A041436 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041436() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 10402, 0, 0, 0, 0, 0, 0, 0}, new long[] {15, 46, 107, 153, 413, 566, 1545, 5201, 157575, 477926, 1113427, 1591353, 4296133, 5887486, 16071105, 54100801});
  }
}
