package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041199 Denominators of continued fraction convergents to sqrt(110).
 * @author Sean A. Irvine
 */
public class A041199 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041199() {
    super(new long[] {-1, 0, 42, 0}, new long[] {1, 2, 41, 84});
  }
}
