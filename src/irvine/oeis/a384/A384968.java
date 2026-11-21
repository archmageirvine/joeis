package irvine.oeis.a384;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A384968 Triangle read by rows: T(n,k) is the number of proper vertex colorings of the n-complete bipartite graph using exactly k interchangeable colors, 2 &lt;= k &lt;= 2*n.
 * @author Gregory Morse
 */
public class A384968 extends Sequence1 {
  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final int mParts;
  private int mN = 0;
  private int mM = 0;
  private Polynomial<Z> mRow;

  protected A384968(final int parts) {
    mParts = parts;
  }

  /** Construct the sequence. */
  public A384968() {
    this(2);
  }

  @Override
  public Z next() {
    if (++mM > mParts * mN) {
      final Polynomial<Z> bell = RING.empty();
      for (int k = 0; k <= mN + 1; ++k) {
        bell.add(Functions.STIRLING2.z(mN + 1, k));
      }
      ++mN;
      mRow = RING.pow(bell, mParts);
      mM = mParts;
    }
    return mRow.coeff(mM);
  }
}
