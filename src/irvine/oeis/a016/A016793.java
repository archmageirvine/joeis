package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016793 a(n) = (3*n + 2)^5.
 * @author Sean A. Irvine
 */
public class A016793 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016793() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {32, 3125, 32768, 161051, 537824, 1419857});
  }
}
