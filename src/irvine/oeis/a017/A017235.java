package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017235 <code>a(n) = (9*n + 6)^3</code>.
 * @author Sean A. Irvine
 */
public class A017235 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017235() {
    super(new long[] {-1, 4, -6, 4}, new long[] {216, 3375, 13824, 35937});
  }
}
