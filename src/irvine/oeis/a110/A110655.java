package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110655 <code>a(n) =</code> A110654(A110654(n)).
 * @author Sean A. Irvine
 */
public class A110655 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110655() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 1, 1, 1});
  }
}
