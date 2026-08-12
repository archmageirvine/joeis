package irvine.oeis.a114;

import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;

/**
 * A114533 Permanent of the n X n matrix with numbers prime(1),prime(2),...,prime(n^2) in order across rows.
 * @author Georg Fischer
 * Copied from A067276.
 */
public class A114533 extends AbstractSequence {

  private int mN;
  private final Sequence mSeq;
  private final DefaultMatrix<Q> mMat;

  /** Construct the sequence. */
  public A114533() {
    this(0, new A000040());
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param seq underlying sequence
   */
  public A114533(final int offset, final Sequence seq) {
    super(offset);
    mN = offset - 1;
    mSeq = seq;
    mMat = new DefaultMatrix<>(0, 0, Q.ZERO);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final int no = mN - 1;
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
    return new MatrixField<>(mN, Rationals.SINGLETON).permanent(mMat).toZ();
  }
}
