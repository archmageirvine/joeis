package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042717 Denominators of continued fraction convergents to sqrt(888).
 * @author Sean A. Irvine
 */
public class A042717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042717() {
    super(new long[] {-1, 0, 0, 0, 298, 0, 0, 0}, new long[] {1, 1, 4, 5, 294, 299, 1191, 1490});
  }
}
