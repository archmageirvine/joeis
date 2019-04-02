package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042187 Denominators of continued fraction convergents to sqrt(618).
 * @author Sean A. Irvine
 */
public class A042187 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042187() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 20186, 0, 0, 0, 0, 0}, new long[] {1, 1, 7, 57, 349, 406, 19837, 20243, 141295, 1150603, 7044913, 8195516});
  }
}
