package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130013 Nonnegative values x of solutions <code>(x,</code> y) to the Diophantine equation <code>x^2+(x+647)^2 =</code> y^2.
 * @author Sean A. Irvine
 */
public class A130013 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130013() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 37, 1768, 1941, 2128, 11937, 12940});
  }
}
