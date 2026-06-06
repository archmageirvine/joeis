package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a080.A080237;
import irvine.util.array.DynamicLongArray;

/**
 * A085176 Transpose of A085178.
 * @author Sean A. Irvine
 */
public class A085176 extends Sequence1 {

  private int mN = 0;
  private int mM = -1;
  private final DirectSequence mA = DirectSequence.create(new A080237());
  private final DynamicLongArray mPos = new DynamicLongArray();

  private Z t(final int row) {
    final Z v = Z.valueOf(row);
    while (!mA.a(mPos.increment(row)).equals(v)) {
      // do nothing
    }
    return Z.valueOf(mPos.get(row));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM + 1);
  }
}
