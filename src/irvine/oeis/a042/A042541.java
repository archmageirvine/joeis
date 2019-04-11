package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042541 Denominators of continued fraction convergents to <code>sqrt(799)</code>.
 * @author Sean A. Irvine
 */
public class A042541 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042541() {
    super(new long[] {-1, 0, 0, 0, 848, 0, 0, 0}, new long[] {1, 3, 4, 15, 844, 2547, 3391, 12720});
  }
}
