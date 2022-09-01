package irvine.oeis.a173;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;

/**
 * A173841 Number of permutations of 1..n with no adjacent pair summing to n+1.
 * k = 1; a(n,k) = Sum_{j=0..m} (-2)^j*binomial(m,j)*(n-j)! where m = max(0, floor((n-k+1)/2)).
 * @author Georg Fischer
 */
public class A173841 implements SequenceWithOffset {

  private int mN;
  private int mOffset;
  private int mK;

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
    mN = -1;
    mOffset = offset;
    mK = k;
  }

  @Override
  public int getOffset() {
    return mOffset;
  }

  @Override
  public Z next() {
    ++mN;
    final int m = mN >= mK ? (mN - mK + 1) / 2 : 0;
    return Integers.SINGLETON.sum(0, m, j -> Z.valueOf(-2).pow(j).multiply(Binomial.binomial(m, j)).multiply(MemoryFactorial.SINGLETON.factorial(mN - j)));
  }
}
