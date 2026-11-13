package irvine.oeis.a142;

import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A142711 a(1)=1, a(2)=2, a(3)=3, a(4)=5, a(5)=7, a(n) = det([[a(n-1), a(n-2), a(n-3)], [a(n-2), a(n-3), a(n-4)], [a(n-3), a(n-4), a(n-5)]]).
 * @author Sean A. Irvine
 */
public class A142711 extends Sequence1 {

  private static final MatrixField<Z> RING = new MatrixField<>(3, IntegerField.SINGLETON);
  private final Z[] mA = {Z.ONE, Z.TWO, Z.THREE, Z.FIVE, Z.SEVEN};
  private int mN = 0;

  @Override
  public Z next() {
    if (mN < mA.length) {
      return mA[mN++];
    }
    final DefaultMatrix<Z> m = new DefaultMatrix<>(3, 3, Z.ZERO);
    m.set(0, 0, mA[4]);
    m.set(0, 1, mA[3]);
    m.set(0, 2, mA[2]);
    m.set(1, 0, mA[3]);
    m.set(1, 1, mA[2]);
    m.set(1, 2, mA[1]);
    m.set(2, 0, mA[2]);
    m.set(2, 1, mA[1]);
    m.set(2, 2, mA[0]);
    final Z det = RING.det(m);
    System.arraycopy(mA, 1, mA, 0, mA.length - 1);
    mA[mA.length - 1] = det;
    return det;
  }
}
