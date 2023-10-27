package irvine.oeis.a260;

import irvine.oeis.a003.A003961;
import irvine.oeis.recur.GeneralRecurrence;

/**
 * A260443 Prime factorization representation of Stern polynomials: a(0) = 1, a(1) = 2, a(2n) = A003961(a(n)), a(2n+1) = a(n)*a(n+1).
 * @author Georg Fischer
 */
public class A260443 extends GeneralRecurrence {

  private final A003961 mSeq = new A003961();

  /** Construct the sequence. */
  public A260443() {
    super(0, 1, 2, 3);
  }

  @Override
  protected void initialize() {
    mLambda.add(n -> mSeq.a(a(n)));
    mLambda.add(n -> a(n).multiply(a(n + 1)));
  }
}
