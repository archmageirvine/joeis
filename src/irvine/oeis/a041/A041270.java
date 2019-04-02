package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041270 Numerators of continued fraction convergents to sqrt(148).
 * @author Sean A. Irvine
 */
public class A041270 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041270() {
    super(new long[] {-1, 0, 146, 0}, new long[] {12, 73, 1764, 10657});
  }
}
