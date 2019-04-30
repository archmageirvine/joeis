package irvine.oeis.a286;

import irvine.oeis.LinearRecurrence;

/**
 * A286264 <code>a(n) = 2*(ceiling((n^2)/2)+1) - 1</code>.
 * @author Sean A. Irvine
 */
public class A286264 extends LinearRecurrence {

  /** Construct the sequence. */
  public A286264() {
    super(new long[] {1, -2, 0, 2}, new long[] {3, 5, 11, 17});
  }
}
