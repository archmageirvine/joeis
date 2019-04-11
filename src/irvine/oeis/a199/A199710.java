package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199710 Expansion of <code>(1+x-14*x^2+13*x^3)/(1-28*x^2+169*x^4)</code>.
 * @author Sean A. Irvine
 */
public class A199710 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199710() {
    super(new long[] {-169, 0, 28, 0}, new long[] {1, 1, 14, 41});
  }
}
