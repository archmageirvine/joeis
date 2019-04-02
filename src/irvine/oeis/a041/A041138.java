package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041138 Numerators of continued fraction convergents to sqrt(78).
 * @author Sean A. Irvine
 */
public class A041138 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041138() {
    super(new long[] {-1, 0, 0, 0, 106, 0, 0, 0}, new long[] {8, 9, 44, 53, 892, 945, 4672, 5617});
  }
}
