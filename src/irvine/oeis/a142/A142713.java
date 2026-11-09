package irvine.oeis.a142;

import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A142713 A determinant sequence: M={{a(-1 + n), a(-2 + n), a(-3 + n), a(-4 + n)}, {a(-2 + n), a(-3 + n), a(-4 + n), a(-5 + n)}, {a(-3 + n), a(-4 + n), a(-5 + n), a(-6 + n)}, {a(-4 + n), a(-5 + n), a(-6 + n), a(-7 + n)}}; a(n)=Det[M].
 * @author Sean A. Irvine
 */
public class A142713 extends Sequence1 {

  private static final MatrixField<Z> RING = new MatrixField<>(4, IntegerField.SINGLETON);
  private final Z[] mA = {Z.ONE, Z.TWO, Z.THREE, Z.FIVE, Z.SEVEN, Z.valueOf(11), Z.valueOf(13)};
  private int mN = 0;

  @Override
  public Z next() {
    if (mN < mA.length) {
      return mA[mN++];
    }
    final DefaultMatrix<Z> m = new DefaultMatrix<>(4, 4, Z.ZERO);
    m.set(0, 0, mA[6]);
    m.set(0, 1, mA[5]);
    m.set(0, 2, mA[4]);
    m.set(0, 3, mA[3]);
    m.set(1, 0, mA[5]);
    m.set(1, 1, mA[4]);
    m.set(1, 2, mA[3]);
    m.set(1, 3, mA[2]);
    m.set(2, 0, mA[4]);
    m.set(2, 1, mA[3]);
    m.set(2, 2, mA[2]);
    m.set(2, 3, mA[1]);
    m.set(3, 0, mA[3]);
    m.set(3, 1, mA[2]);
    m.set(3, 2, mA[1]);
    m.set(3, 3, mA[0]);
    final Z det = RING.det(m);
    System.arraycopy(mA, 1, mA, 0, mA.length - 1);
    mA[mA.length - 1] = det;
    return det;
  }
}
