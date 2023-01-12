package irvine.oeis.a102;

import irvine.oeis.recur.GeneralRecurrence;

/**
 * A102877 a(0) = 1, a(1) = 1; for n&gt;0, a(2*n) = 3*a(2n-1), a(2*n+1) = 3*a(2*n) - 2*a(n-1).
 * @author Georg Fischer
 */
public class A102877 extends GeneralRecurrence {

  /** Construct the sequence. */
  public A102877() {
    super(0, 1, 1);
  }

  @Override
  protected void initialize() {
    mLambda.add(n -> a(2 * n - 1).multiply(3));
    mLambda.add(n -> a(2 * n).multiply(3).subtract(a(n - 1).multiply2()));
  }
}
