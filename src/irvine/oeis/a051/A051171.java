package irvine.oeis.a051;

import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.partitions.IntegerPartition;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051171 A variation on A056223.
 * @author Sean A. Irvine
 */
public class A051171 extends Sequence1 {

  private int mN = 0;
  final DefaultMatrix<Q> mMat = new DefaultMatrix<>(0, 0, Q.ZERO);

  @Override
  public Z next() {
    // det is much faster over Q
    final MatrixField<Q> ring = new MatrixField<>(++mN, Rationals.SINGLETON);
    mMat.setCols(mN);
    mMat.setRows(mN);
    for (int k = 0; k < mN; ++k) {
      mMat.set(mN - 1, k, new Q(IntegerPartition.partitions(mN + k)));
      mMat.set(k, mN - 1, new Q(IntegerPartition.partitions(mN + k)));
    }
    return ring.det(mMat).toZ();
  }
}
