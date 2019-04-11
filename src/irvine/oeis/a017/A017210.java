package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017210 <code>a(n) = (9*n + 4)^2</code>.
 * @author Sean A. Irvine
 */
public class A017210 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017210() {
    super(new long[] {1, -3, 3}, new long[] {16, 169, 484});
  }
}
