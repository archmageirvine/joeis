package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199028 a(n) = (9*11^n - 1)/2.
 * @author Sean A. Irvine
 */
public class A199028 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199028() {
    super(new long[] {-11, 12}, new long[] {4, 49});
  }
}
