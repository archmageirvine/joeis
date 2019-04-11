package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157815 <code>a(n) = 8984250*n - 330</code>.
 * @author Sean A. Irvine
 */
public class A157815 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157815() {
    super(new long[] {-1, 2}, new long[] {8983920, 17968170});
  }
}
