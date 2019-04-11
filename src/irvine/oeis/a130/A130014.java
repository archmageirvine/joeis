package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130014 Nonnegative values x of solutions <code>(x,</code> y) to the Diophantine equation <code>x^2+(x+881)^2 =</code> y^2.
 * @author Sean A. Irvine
 */
public class A130014 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130014() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 43, 2440, 2643, 2860, 16443, 17620});
  }
}
