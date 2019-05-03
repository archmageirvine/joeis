package irvine.oeis.a030;

import irvine.oeis.LinearRecurrence;

/**
 * A030640 Discriminant of lattice <code>A_n</code> of determinant <code>n+1</code>.
 * @author Sean A. Irvine
 */
public class A030640 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030640() {
    super(new long[] {-1, 0, -2, 0}, new long[] {1, 1, -3, -2});
  }
}
