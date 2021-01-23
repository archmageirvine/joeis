package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017033 a(n) = (7*n + 4)^5.
 * @author Sean A. Irvine
 */
public class A017033 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017033() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1024, 161051, 1889568, 9765625, 33554432, 90224199});
  }
}
