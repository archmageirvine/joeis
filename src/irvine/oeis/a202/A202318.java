package irvine.oeis.a202;
// manually seqop at 2023-06-02 22:41

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a036.A036283;

/**
 * A202318 Let (n)_p denote the exponent of prime p in the prime power factorization of n. Then a(n) is defined by the formulas a(1)=1; for n &gt;= 2, (a(n))_2 = (n)_2, (a(n))_3 = (n)_3 and, for p &gt;= 5, (a(n))_p = 1 + ((2n)/(p-1))_p if p-1|2*n, and (a(n))_p = 0 otherwis
 * @author Georg Fischer
 */
public class A202318 extends AbstractSequence {

  private int mN = 0;
  private final A036283 mSeq = new A036283();

  /** Construct the sequence. */
  public A202318() {
    super(1);
    int bOffset = 1 - 1;
    while (bOffset < mN) {
      ++bOffset;
      mSeq.next();
    }
  }

  @Override
  public Z next() {
    ++mN;
    return mSeq.next().divide(6);
  }
}
