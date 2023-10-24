package irvine.oeis.a245;

import irvine.oeis.a003.A003961;
import irvine.oeis.a254.A254049;
import irvine.oeis.recur.GeneralRecurrence;

/**
 * A245612 Permutation of natural numbers: a(0) = 1, a(1) = 2, a(2n) = 3*a(n)-1, a(2n+1) = A254049(a(n)); composition of A048673 and A163511.
 * @author Georg Fischer
 */
public class A245612 extends GeneralRecurrence {

  private final A254049 mSeq2 = new A254049();
  private final A003961 mSeq3 = new A003961();

  /** Construct the sequence. */
  public A245612() {
    super(0, 1, 2, 5);
  }

  @Override
  protected void initialize() {
    mLambda.add(n -> a(n).multiply(3).add(-1));
    mLambda.add(n -> mSeq2.a(a(n)));
//  mLambda.add(n -> mSeq3.a(2*n - 1).add(1).divide2());
  }
}
