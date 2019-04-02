package irvine.oeis.a035;

import irvine.oeis.LinearRecurrence;

/**
 * A035039 a(n) = 2^n - C(n,0) - C(n,1) - ... - C(n,6).
 * @author Sean A. Irvine
 */
public class A035039 extends LinearRecurrence {

  /** Construct the sequence. */
  public A035039() {
    super(new long[] {-2, 15, -49, 91, -105, 77, -35, 9}, new long[] {0, 0, 0, 0, 0, 0, 0, 1});
  }
}
