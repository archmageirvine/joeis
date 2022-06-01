package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017044 a(n) = (7*n + 5)^4.
 * @author Sean A. Irvine
 */
public class A017044 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017044() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {625, 20736, 130321, 456976, 1185921});
  }
}
