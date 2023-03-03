package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199209 a(n) = 10*4^n+1.
 * @author Sean A. Irvine
 */
public class A199209 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199209() {
    super(new long[] {-4, 5}, new long[] {11, 41});
  }
}
