package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198768 a(n) = 9*5^n-1.
 * @author Sean A. Irvine
 */
public class A198768 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198768() {
    super(new long[] {-5, 6}, new long[] {8, 44});
  }
}
