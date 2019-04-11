package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289787 p-INVERT of the even positive integers (A005843), where p(S) <code>= 1 -</code> S - S^2.
 * @author Sean A. Irvine
 */
public class A289787 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289787() {
    super(new long[] {-1, 6, -6, 6}, new long[] {2, 12, 62, 312});
  }
}
