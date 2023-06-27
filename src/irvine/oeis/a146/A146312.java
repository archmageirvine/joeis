package irvine.oeis.a146;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A146312 a(n) = -cos((2 n - 1) arcsin(sqrt(3)))^2 = -1 + cosh((2 n - 1) arcsinh(sqrt(2)))^2.
 * @author Sean A. Irvine
 */
public class A146312 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146312() {
    super(1, new long[] {1, -99, 99}, new long[] {2, 242, 23762});
  }
}
