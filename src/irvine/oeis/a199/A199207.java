package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199207 a(n) = 7*4^n+1.
 * @author Sean A. Irvine
 */
public class A199207 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199207() {
    super(new long[] {-4, 5}, new long[] {8, 29});
  }
}
