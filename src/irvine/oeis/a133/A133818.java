package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133818 <code>a(n) = (8*n+3)*(8*n+5)*(8*n+7)*(8*n+9)</code>.
 * @author Sean A. Irvine
 */
public class A133818 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133818() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {945, 36465, 229425, 801009, 2070705});
  }
}
