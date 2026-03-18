package irvine.oeis.a084;

import irvine.math.z.Z;

/**
 * A084251 G.f.: A(x) = exp(sum(n&gt;=1, A084250(n)*x^n/n)), where A084250 lists the least distinct positive integers that allow A(x) to be an integer power series.
 * @author Sean A. Irvine
 */
public class A084251 extends A084250 {

  /** Construct the sequence. */
  public A084251() {
    super(0);
  }

  @Override
  protected Z select(final Z a, final Z b) {
    return b;
  }
}
