package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154245 a(n) = ( (4 + sqrt(7))^n - (4 - sqrt(7))^n )/(2*sqrt(7)).
 * @author Sean A. Irvine
 */
public class A154245 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154245() {
    super(new long[] {-9, 8}, new long[] {1, 8});
  }
}
