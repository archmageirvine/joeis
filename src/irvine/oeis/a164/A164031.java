package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164031 <code>a(n) = ((2+3*sqrt(2))*(5+sqrt(2))^n+(2-3*sqrt(2))*(5-sqrt(2))^n)/4</code>.
 * @author Sean A. Irvine
 */
public class A164031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164031() {
    super(new long[] {-23, 10}, new long[] {1, 8});
  }
}
