package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154350 <code>a(n) = ( (9 + 2*sqrt(2))^n - (9 - 2*sqrt(2))^n )/(4*sqrt(2))</code>.
 * @author Sean A. Irvine
 */
public class A154350 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154350() {
    super(new long[] {-73, 18}, new long[] {1, 18});
  }
}
