package irvine.oeis.a146;

import irvine.oeis.LinearRecurrence;

/**
 * A146312 <code>a(n) =</code> -cos((2 <code>n - 1)</code> arcsin(sqrt(3)))^2 <code>= -1 +</code> cosh((2 <code>n - 1)</code> arcsinh(sqrt(2)))^2.
 * @author Sean A. Irvine
 */
public class A146312 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146312() {
    super(new long[] {1, -99, 99}, new long[] {2, 242, 23762});
  }
}
