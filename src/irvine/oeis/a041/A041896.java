package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041896 Numerators of continued fraction convergents to sqrt(470).
 * @author Sean A. Irvine
 */
public class A041896 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041896() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 3382, 0, 0, 0, 0, 0}, new long[] {21, 22, 65, 542, 1149, 1691, 72171, 73862, 219895, 1833022, 3885939, 5718961});
  }
}
