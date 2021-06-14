package irvine.oeis.a059;
// manually 2021-06-13

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059332 Determinant of n X n matrix A defined by A[i,j] = (i+j-1)! for 1 &lt;= i,j &lt;= n.
 * Recurrence: a(n) = a(n-1)*(n!)*(n-1)! for n >= 2.
 * @author Georg Fischer
 */
public class A059332 implements Sequence {

  private Z mFact;
  private Z mAn;
  private int mN;

  /** Construct the sequence */
  public A059332() {
    mFact = Z.ONE;
    mAn = Z.ONE;
    mN = 0;
  }

  @Override
  public Z next() {
    final Z result = mAn;
    ++mN;
    mAn = mAn.multiply(mFact);
    mFact = mFact.multiply(mN);
    mAn = mAn.multiply(mFact);
    return result;
  }
}
