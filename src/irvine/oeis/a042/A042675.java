package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042675 Denominators of continued fraction convergents to <code>sqrt(867)</code>.
 * @author Sean A. Irvine
 */
public class A042675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042675() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 140452, 0, 0, 0, 0, 0}, new long[] {1, 2, 9, 263, 1061, 2385, 139391, 281167, 1264059, 36938878, 149019571, 334978020});
  }
}
