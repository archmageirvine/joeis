package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041181 Denominators of continued fraction convergents to sqrt(101).
 * @author Sean A. Irvine
 */
public class A041181 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041181() {
    super(new long[] {1, 20}, new long[] {1, 20});
  }
}
