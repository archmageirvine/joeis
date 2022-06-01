package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199110 a(n) = 7*3^n+1.
 * @author Sean A. Irvine
 */
public class A199110 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199110() {
    super(new long[] {-3, 4}, new long[] {8, 22});
  }
}
