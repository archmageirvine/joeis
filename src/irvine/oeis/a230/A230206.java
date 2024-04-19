package irvine.oeis.a230;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A230206 Trapezoid of dot products of row 3 (signs alternating) with sequential 4-tuples read by rows in Pascal's triangle A007318: T(n,k) is the linear combination of the 4-tuples (C(3,0), -C(3,1), C(3,2), -C(3,3)) and (C(n-1,k-3), C(n-1,k-2), C(n-1,k-1), C(n-1,k)), n &gt;= 1, 0 &lt;= k &lt;= n+2.
 * T(n,k) is the linear combination of the 4-tuples (C(3,0), -C(3,1), C(3,2), -C(3,3)) and (C(n-1,k-3), C(n-1,k-2), C(n-1,k-1), C(n-1,k)), n &gt;= 1, 0 &lt;= k &lt;= n+2.
 * @author Georg Fischer
 */
public class A230206 extends AbstractSequence {

  private int mN;
  private int mK;
  private final int mM;

  /** Construct the sequence. */
  public A230206() {
    this(1, 3);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param m factor for binomial(n-2,k-1)
   */
  public A230206(final int offset, final int m) {
    super(offset);
    mM = m;
    mN = 0;
    mK = mN + mM;
  }

  @Override
  public Z next() {
    // for(k=0, n+m-1, print1(if(k==0, (-1)^m, sum(j=0, n+m-1, (-1)^(j+m)*binomial(m,j)*binomial(n-1,k-j)))
    ++mK;
    if (mK >= mN + mM) {
      ++mN;
      mK = 0;
    }
    if (mK == 0) {
      return Z.NEG_ONE.pow(mM);
    }
    return Integers.SINGLETON.sum(0, mN + mM - 1, j -> Z.NEG_ONE.pow(j + mM).multiply(Binomial.binomial(mM, j)).multiply(Binomial.binomial(mN - 1, mK - j)));
  }
}
