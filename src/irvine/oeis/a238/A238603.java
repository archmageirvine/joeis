package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238603 A sixth-order linear divisibility sequence related to <code>A000225: a(n) := (1/105)*(2^(3*n) - 1)*(2^(4*n) - 1)/(2^n - 1)</code>.
 * @author Sean A. Irvine
 */
public class A238603 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238603() {
    super(new long[] {-262144, 487424, -280448, 59432, -4382, 119}, new long[] {1, 51, 2847, 170391, 10555655, 664857063});
  }
}
