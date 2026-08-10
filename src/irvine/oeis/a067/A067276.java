package irvine.oeis.a067;

import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;

/**
 * A067276 Determinant of n X n matrix containing the first n^2 primes in increasing order.
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class A067276 extends AbstractSequence {

  private int mN = 0;
  private final Sequence mSeq;
  private final DefaultMatrix<Q> mMat;

  /** Construct the sequence. */
  public A067276() {
    this(1, new A000040());
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param seq underlying sequence
   */
  public A067276(final int offset, final Sequence seq) {
    super(offset);
    mN = offset - 1;
    mSeq = seq;
    mMat = new DefaultMatrix<>(0, 0, Q.ZERO);
  }

  @Override
  public Z next() {
    final int no = mN++;
    mMat.setRows(mN);
    mMat.setCols(mN);
    final long limit = no * no; // size of mMat 
    long ro = 0;
    long co = 0;
    long count = 0;
    for (long rn = 0; rn < mN; ++rn) {
      for (long cn = 0; cn < mN; ++cn) {
        if (++count <= limit) { // take elements from previous iteration
          if (co < no) {
            mMat.set(rn, cn, mMat.get(ro, co++));
          } else {
            ++ro;
            co = 0;
            mMat.set(rn, cn, mMat.get(ro, co++));
          }
        } else { // get next() elements from mSeq
          mMat.set(rn, cn, new Q(mSeq.next()));
        }
      }
    }
    return new MatrixField<>(mN, Rationals.SINGLETON).det(mMat).toZ();
  }
}
