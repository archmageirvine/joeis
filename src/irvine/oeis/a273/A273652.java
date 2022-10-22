package irvine.oeis.a273;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A273652 Number of forests of labeled rooted trees of height at most 1, with n labels, two of which are used for root nodes and any root may contain &gt;= 1 labels.
 * two of which are used for root nodes and any root may contain &gt;= 1 labels.
 * a(n) = C(n, 2) * Sum_{j=0.. 2} Stirling2( 2,j) * j^(n- 2)
 * @author Georg Fischer
 */
public class A273652 extends AbstractSequence {

  private int mN;
  private final int mParm;

  /** Construct the sequence. */
  public A273652() {
    this(2, 2);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param parm parameter
   */
  public A273652(final int offset, final int parm) {
    super(offset);
    mN = offset - 1;
    mParm = parm;
  }

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN, mParm).multiply(Integers.SINGLETON.sum(0, mParm,
      j -> Stirling.secondKind(mParm, j).multiply(j == 0 && mN - mParm == 0 ? Z.ONE : Z.valueOf(j).pow(mN - mParm))));
  }
}
