package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041085 Denominators of continued fraction convergents to sqrt(50).
 * @author Sean A. Irvine
 */
public class A041085 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041085() {
    super(new long[] {1, 14}, new long[] {1, 14});
  }
}
