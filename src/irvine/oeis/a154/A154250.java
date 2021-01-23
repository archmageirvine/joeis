package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154250 a(n) = ( (9 + sqrt(7))^n - (9 - sqrt(7))^n )/(2*sqrt(7)).
 * @author Sean A. Irvine
 */
public class A154250 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154250() {
    super(new long[] {-74, 18}, new long[] {1, 18});
  }
}
