package irvine.oeis.a273;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A273622 a(n) = (1/3)*(Lucas(3*n) - Lucas(n)).
 * @author Sean A. Irvine
 */
public class A273622 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273622() {
    super(1, new long[] {-1, -5, -2, 5}, new long[] {1, 5, 24, 105});
  }
}
