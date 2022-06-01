package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154350 a(n) = ( (9 + 2*sqrt(2))^n - (9 - 2*sqrt(2))^n )/(4*sqrt(2)).
 * @author Sean A. Irvine
 */
public class A154350 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154350() {
    super(new long[] {-73, 18}, new long[] {1, 18});
  }
}
