package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041839 Denominators of continued fraction convergents to sqrt(440).
 * @author Sean A. Irvine
 */
public class A041839 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041839() {
    super(new long[] {-1, 0, 42, 0}, new long[] {1, 1, 41, 42});
  }
}
