package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041887 Denominators of continued fraction convergents to sqrt(465).
 * @author Sean A. Irvine
 */
public class A041887 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041887() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 31742, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 7, 16, 39, 94, 321, 415, 736, 31327, 32063, 63390, 222233, 507856, 1237945, 2983746, 10189183, 13172929, 23362112});
  }
}
