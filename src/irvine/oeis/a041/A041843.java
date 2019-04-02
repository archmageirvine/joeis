package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041843 Denominators of continued fraction convergents to sqrt(443).
 * @author Sean A. Irvine
 */
public class A041843 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041843() {
    super(new long[] {-1, 0, 884, 0}, new long[] {1, 21, 883, 18564});
  }
}
