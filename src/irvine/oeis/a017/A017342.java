package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017342 <code>a(n) = (10*n + 6)^2</code>.
 * @author Sean A. Irvine
 */
public class A017342 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017342() {
    super(new long[] {1, -3, 3}, new long[] {36, 256, 676});
  }
}
