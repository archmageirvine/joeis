package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017356 a(n) = (10*n+7)^4.
 * @author Sean A. Irvine
 */
public class A017356 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017356() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {2401, 83521, 531441, 1874161, 4879681});
  }
}
