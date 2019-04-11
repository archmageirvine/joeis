package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156159 Squares of the form <code>k^2+(k+17)^2</code> with integer k.
 * @author Sean A. Irvine
 */
public class A156159 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156159() {
    super(new long[] {1, -1, 0, -34, 34, 0, 1}, new long[] {169, 289, 625, 2809, 7225, 18769, 93025});
  }
}
