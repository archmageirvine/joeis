package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075536 a(n) = ((1+(-1)^n)*T(n+1) + (1-(-1)^n)*S(n))/2, where T(n) = tribonacci numbers A000073, S(n) = generalized tribonacci numbers A001644.
 * @author Sean A. Irvine
 */
public class A075536 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075536() {
    super(new long[] {1, 0, 1, 0, 3, 0}, new long[] {0, 1, 1, 7, 4, 21});
  }
}
