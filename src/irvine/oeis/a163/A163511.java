package irvine.oeis.a163;

import irvine.oeis.a003.A003961;
import irvine.oeis.recur.GeneralRecurrence;

/**
 * A163511 a(0)=1. a(n) = p(A000120(n)) * Product_{m=1..A000120(n)} p(m)^A163510(n,m), where p(m) is the m-th prime.
 * <code>a(0) = 1, a(1) = 2, a(2n) = 2*a(n), a(2n+1) = A003961(a(n)).</code>
 * @author Georg Fischer
 */
public class A163511 extends GeneralRecurrence {

  private final A003961 mSeq = new A003961();

  /** Construct the sequence. */
  public A163511() {
    super(0, 1, 2, 4);
  }

  @Override
  protected void initialize() {
    mLambda.add(n -> a(n).multiply2());
    mLambda.add(n -> mSeq.a(a(n)));
  }
}
