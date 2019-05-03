package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122788 <code>(1,3)-entry</code> of the <code>3 X 3</code> matrix <code>M^n</code>, where M <code>= {{0, -1, 1}, {1, 1, 0}, {0, 1, 1}}</code>.
 * @author Sean A. Irvine
 */
public class A122788 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122788() {
    super(new long[] {2, -2, 2}, new long[] {0, 1, 1});
  }
}
