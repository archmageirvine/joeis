package irvine.oeis.a143;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A143609 Numerators of the upper principal and intermediate convergents to 2^(1/2).
 * @author Sean A. Irvine
 */
public class A143609 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143609() {
    super(new long[] {-1, 0, 6, 0}, new long[] {2, 3, 10, 17});
  }
}
