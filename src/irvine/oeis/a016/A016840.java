package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016840 (4n+3)^4.
 * @author Sean A. Irvine
 */
public class A016840 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016840() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {81, 2401, 14641, 50625, 130321});
  }
}
