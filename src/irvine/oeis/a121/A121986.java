package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121986 Expansion of <code>x*(-1+2*x-3*x^3+x^4)/((x^3+x^2+x-1) * (x-1)^2)</code>.
 * @author Sean A. Irvine
 */
public class A121986 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121986() {
    super(new long[] {1, -1, 0, -2, 3}, new long[] {1, 1, 1, 4, 8});
  }
}
