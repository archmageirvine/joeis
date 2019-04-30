package irvine.oeis.a146;

import irvine.oeis.LinearRecurrence;

/**
 * A146312 <code>a(n) = -cos((2 n - 1) arcsin(sqrt(3)))^2 = -1 + cosh((2 n - 1) arcsinh(sqrt(2)))^2</code>.
 * @author Sean A. Irvine
 */
public class A146312 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146312() {
    super(new long[] {1, -99, 99}, new long[] {2, 242, 23762});
  }
}
