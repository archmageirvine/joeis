package irvine.oeis.a243;

import irvine.oeis.a064.A064989;
import irvine.oeis.recur.GeneralRecurrence;

/**
 * A243071 Permutation of nonnegative integers: a(1) = 0, a(2) = 1, a(2n) = 2*a(n), a(2n+1) = 1 + 2*a(A064989(2n+1)).
 * @author Georg Fischer
 */
public class A243071 extends GeneralRecurrence {

  private final A064989 mSeq = new A064989();

  /** Construct the sequence. */
  public A243071() {
    super(1, 0, 1, 3);
  }

  @Override
  protected void initialize() {
    mLambda.add(n -> a(n).multiply2());
    mLambda.add(n -> a(mSeq.a(2 * n + 1).intValueExact()).multiply2().add(1));
  }
}
