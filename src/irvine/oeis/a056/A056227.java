package irvine.oeis.a056;

import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a008.A008683;

/**
 * A056227 Hankel transform of Moebius function A008683.
 * @author Sean A. Irvine
 */
public class A056227 implements Sequence {

  private final MemorySequence mA = MemorySequence.cachedSequence(new PrependSequence(new A008683(), -1));
  private int mN = 0;
  final DefaultMatrix<Q> mMat = new DefaultMatrix<>(0, 0, Q.ZERO);

  @Override
  public Z next() {
    final MatrixField<Q> ring = new MatrixField<>(++mN, Rationals.SINGLETON);
    mMat.setCols(mN);
    mMat.setRows(mN);
    for (int k = 0; k < mN; ++k) {
      mMat.set(mN - 1, k, new Q(mA.a(mN + k - 1)));
      mMat.set(k, mN - 1, new Q(mA.a(mN + k - 1)));
    }
    return ring.det(mMat).toZ();
  }
}
