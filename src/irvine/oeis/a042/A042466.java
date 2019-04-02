package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042466 Numerators of continued fraction convergents to sqrt(761).
 * @author Sean A. Irvine
 */
public class A042466 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042466() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 1600, 0, 0, 0, 0, 0, 0}, new long[] {27, 28, 55, 138, 331, 469, 800, 43669, 44469, 88138, 220745, 529628, 750373, 1280001});
  }
}
