package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134940 Define <code>f(n) by e(n+1) = e(n) + 3^{n+1} - 1 + 2*f(n)</code>, where the rational numbers <code>e(n)</code> are defined in A134939; then <code>a(n)</code> is the numerator of <code>f(n)</code>.
 * @author Sean A. Irvine
 */
public class A134940 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134940() {
    super(new long[] {-2025, 1440, -342, 32}, new long[] {0, 17, 424, 7889});
  }
}
