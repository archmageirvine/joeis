package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041646 Numerators of continued fraction convergents to sqrt(342).
 * @author Sean A. Irvine
 */
public class A041646 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041646() {
    super(new long[] {-1, 0, 74, 0}, new long[] {18, 37, 1350, 2737});
  }
}
