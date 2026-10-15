package irvine.oeis.a240;
// manually 2026-10-14/addr at 2026-10-14 

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AdditiveSequence;

/**
 * A240231 Number of factors needed in the unique factorization of positive integers into terms of A186285 where any term is used at most twice.
 * Multiplicative with: That is, apart from the initial term,
 * @author Georg Fischer
 */
public class A240231 extends AdditiveSequence {

  /** Construct the sequence. */
  public A240231() {
    super(1, (p, e) -> Functions.DIGIT_SUM.z(3, e));
  }

  @Override
  public Z next() {
    mN += mStep;
    return mN == 1 ? Z.ONE : a(Z.valueOf(mN));
  }

  @Override
  public Z a(final Z n) {
    if (n.isOne()) {
      return Z.ONE;
    }
    return super.a(n);
  }
}
