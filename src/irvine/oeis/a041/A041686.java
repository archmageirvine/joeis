package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041686 Numerators of continued fraction convergents to sqrt(363).
 * @author Sean A. Irvine
 */
public class A041686 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041686() {
    super(new long[] {-1, 0, 724, 0}, new long[] {19, 362, 13775, 262087});
  }
}
