package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041192 Numerators of continued fraction convergents to sqrt(107).
 * @author Sean A. Irvine
 */
public class A041192 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041192() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 1924, 0, 0, 0, 0, 0}, new long[] {10, 21, 31, 300, 331, 962, 19571, 40104, 59675, 577179, 636854, 1850887});
  }
}
