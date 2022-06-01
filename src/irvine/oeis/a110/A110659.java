package irvine.oeis.a110;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A110659 a(n) = A028242(A110654(n)).
 * @author Sean A. Irvine
 */
public class A110659 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110659() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {1, 0, 0, 2, 2, 1, 1, 3});
  }
}
