package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069075 <code>a(n) = (4n^2-1)^2</code>.
 * @author Sean A. Irvine
 */
public class A069075 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069075() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 9, 225, 1225, 3969});
  }
}
