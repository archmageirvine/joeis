package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154347 <code>a(n) = ( (7 + 2*sqrt(2))^n - (7 - 2*sqrt(2))^n )/(4*sqrt(2))</code>.
 * @author Sean A. Irvine
 */
public class A154347 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154347() {
    super(new long[] {-41, 14}, new long[] {1, 14});
  }
}
