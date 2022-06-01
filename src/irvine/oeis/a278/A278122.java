package irvine.oeis.a278;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A278122 a(n) = 204*2^n - 248.
 * @author Sean A. Irvine
 */
public class A278122 extends LinearRecurrence {

  /** Construct the sequence. */
  public A278122() {
    super(new long[] {-2, 3}, new long[] {160, 568});
  }
}
