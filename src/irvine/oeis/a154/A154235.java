package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154235 a(n) = ( (4 + sqrt(6))^n - (4 - sqrt(6))^n )/(2*sqrt(6)).
 * @author Sean A. Irvine
 */
public class A154235 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154235() {
    super(new long[] {-10, 8}, new long[] {1, 8});
  }
}
