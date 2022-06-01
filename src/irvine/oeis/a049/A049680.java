package irvine.oeis.a049;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A049680 a(n) = (L(n) + L(2*n))/2, where L = A000032 (the Lucas sequence).
 * @author Sean A. Irvine
 */
public class A049680 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049680() {
    super(new long[] {1, -2, -3, 4}, new long[] {2, 2, 5, 11});
  }
}
