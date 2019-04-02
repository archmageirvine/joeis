package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041661 Denominators of continued fraction convergents to sqrt(349).
 * @author Sean A. Irvine
 */
public class A041661 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041661() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 18420, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, 22, 157, 336, 493, 18084, 18577, 55238, 405243, 2891939, 6189121, 9081060});
  }
}
