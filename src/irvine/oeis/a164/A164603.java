package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164603 <code>a(n) = ((1+4*sqrt(2))*(2+2*sqrt(2))^n + (1-4*sqrt(2))*(2-2*sqrt(2))^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A164603 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164603() {
    super(new long[] {4, 4}, new long[] {1, 18});
  }
}
