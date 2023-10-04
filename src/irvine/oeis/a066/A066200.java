package irvine.oeis.a066;

import irvine.oeis.a005.A005132;

/**
 * A066200 a(1) = 1; for n &gt; 1, a(n) = a(n-1)-(n+2) if this is positive and has not already appeared, otherwise a(n) = a(n-1)+(n+2).
 * @author Sean A. Irvine
 */
public class A066200 extends A005132 {

  /** Construct the sequence. */
  public A066200() {
    super(1, -2, 2);
  }
}
