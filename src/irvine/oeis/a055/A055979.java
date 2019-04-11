package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055979 Solutions (value of r) of the Diophantine equation <code>2*x^2 + 3*x + 2 =</code> r^2.
 * @author Sean A. Irvine
 */
public class A055979 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055979() {
    super(new long[] {-1, 0, 34, 0}, new long[] {4, 11, 134, 373});
  }
}
