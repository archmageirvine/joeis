package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265037 G.f.: <code>(1 + 22*x - 34*x^2 + 14*x^3)/((1 - x)^2*(1 - 6*x + 8*x^2))</code>.
 * @author Sean A. Irvine
 */
public class A265037 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265037() {
    super(new long[] {-8, 22, -21, 8}, new long[] {1, 30, 185, 886});
  }
}
