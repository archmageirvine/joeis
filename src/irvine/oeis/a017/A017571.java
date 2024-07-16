package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017571 a(n) = (12n+4)^3.
 * @author Sean A. Irvine
 */
public class A017571 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017571() {
    super(new long[] {-1, 4, -6, 4}, new long[] {64, 4096, 21952, 64000});
  }
}
