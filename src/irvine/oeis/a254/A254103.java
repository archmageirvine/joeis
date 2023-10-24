package irvine.oeis.a254;

import irvine.oeis.recur.GeneralRecurrence;

/**
 * A254103 Permutation of natural numbers: a(0) = 0, a(2n) = (3*a(n))-1, a(2n+1) = floor((3*(1+a(n)))/2).
 * @author Georg Fischer
 */
public class A254103 extends GeneralRecurrence {

  /** Construct the sequence. */
  public A254103() {
    super(0, 0, 1);
  }

  @Override
  protected void initialize() {
    mLambda.add(n -> a(n).multiply(3).add(-1));
    mLambda.add(n -> a(n).add(1).multiply(3).divide2());
  }
}
