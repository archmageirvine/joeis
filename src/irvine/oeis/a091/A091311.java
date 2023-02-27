package irvine.oeis.a091;

import irvine.oeis.recur.GeneralRecurrence;

/**
 * A091311 Partial sums of 3^A007814(n).
 * Recurrence: <code>a(2n) = 3*a(n) + n, a(2*n+1) = 3*a(n) + n + 1</code>
 * @author Georg Fischer
 */
public class A091311 extends GeneralRecurrence {

  /** Construct the sequence. */
  public A091311() {
    super(0, 0, 1, 4);
  }

  @Override
  protected void initialize() {
    mLambda.add(n -> a(n).multiply(3).add(n));
    mLambda.add(n -> a(n).multiply(3).add(n + 1));
  }
}
