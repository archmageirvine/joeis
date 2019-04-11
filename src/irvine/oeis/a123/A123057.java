package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123057 Values x of solutions <code>(x,</code> y) to the Diophantine equation (x-y)^4-8xy=0 with x&gt;=y.
 * @author Sean A. Irvine
 */
public class A123057 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123057() {
    super(new long[] {-1, 40, -206, 40}, new long[] {0, 8, 216, 7000});
  }
}
