package irvine.oeis.a173;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A173841 Number of permutations of 1..n with no adjacent pair summing to n+1.
 * k = 1; a(n,k) = Sum_{j=0..m} (-2)^j*binomial(m,j)*(n-j)! where m = max(0, floor((n-k+1)/2)).
 * @author Georg Fischer
 */
public class A173841 extends AbstractSequence {

  private int mN;
  private final int mK;

  /** Construct the sequence. */
  public A173841() {
    this(0, 1);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param k difference to n
   */
  public A173841(final int offset, final int k) {
    super(offset);
    mN = -1;
    mK = k;
  }

  @Override
  public Z next() {
    ++mN;
    final int m = mN >= mK ? (mN - mK + 1) / 2 : 0;
    return Integers.SINGLETON.sum(0, m, j -> Z.valueOf(-2).pow(j).multiply(Binomial.binomial(m, j)).multiply(Functions.FACTORIAL.z(mN - j)));
  }
}
