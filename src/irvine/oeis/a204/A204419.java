package irvine.oeis.a204;

import irvine.oeis.LinearRecurrence;

/**
 * A204419 y-values in the solutions to <code>x^2 -</code> 313*y^2 <code>= 1</code>.
 * @author Sean A. Irvine
 */
public class A204419 extends LinearRecurrence {

  /** Construct the sequence. */
  public A204419() {
    super(new long[] {-1, 64376241658269698L}, new long[] {0, 1819380158564160L});
  }
}
