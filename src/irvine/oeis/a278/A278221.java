package irvine.oeis.a278;
// manually 2024-06-20

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.a122.A122111;

/**
 * A278221 Filtering sequence (related to prime factorization): a(n) = A046523(A122111(n)).
 * @author Georg Fischer
 */
public class A278221 extends AbstractSequence implements DirectSequence {

  private static final DirectSequence A122111 = new A122111();
  private int mN;

  /** Construct the sequence. */
  public A278221() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }

  @Override
  public Z a(final Z n) {
    return FactorUtils.leastPrimeSignature(A122111.a(n));
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

}
