package irvine.oeis.a254;

import irvine.oeis.recur.GeneralRecurrence;

/**
 * A254104 Permutation of natural numbers: a(0) = 0, a(3n) = 1 + 2*a(2n - 1), a(3n+1) = 1 + 2*a(2n), a(3n+2) = 2*a(n+1).
 * @author Georg Fischer
 */
public class A254104 extends GeneralRecurrence {

  /** Construct the sequence. */
  public A254104() {
    super(0, 0, 1, 2, 3);
  }

  @Override
  protected void initialize() {
    mLambda.add(n -> a(2 * n - 1).multiply2().add(1));
    mLambda.add(n -> a(2 * n).multiply2().add(1));
    mLambda.add(n -> a(n + 1).multiply2());
  }
}
