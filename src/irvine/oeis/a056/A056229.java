package irvine.oeis.a056;

import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000010;
import irvine.oeis.memory.MemorySequence;

/**
 * A056229 Hankel transform of Euler totient function (A000010).
 * @author Sean A. Irvine
 */
public class A056229 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A000010());
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
