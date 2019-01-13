package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247854.
 * @author Sean A. Irvine
 */
public class A247854 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247854() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, -10720, 46144, -406944, 27728000, 421271200, 2938887360L, 13857016544L, 50936525056L, 157077960480L});
  }
}
