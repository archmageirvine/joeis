package irvine.oeis.a066;

import irvine.oeis.a005.A005132;

/**
 * A066199 a(1) = 1; for n &gt; 1, a(n) = a(n-1)-(n+1) if this is positive and has not already appeared in the sequence, otherwise a(n) = a(n-1)+(n+1).
 * @author Sean A. Irvine
 */
public class A066199 extends A005132 {

  /** Construct the sequence. */
  public A066199() {
    super(1, -1, 1);
  }
}
