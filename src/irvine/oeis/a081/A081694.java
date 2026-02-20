package irvine.oeis.a081;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A081694 From P-positions in a certain game.
 * @author Sean A. Irvine
 */
public class A081694 extends Sequence0 {

  protected final TreeSet<Z> mB = new TreeSet<>();
  private final LongDynamicBooleanArray mA = new LongDynamicBooleanArray();
  private long mM = 0;

  private void updateB() {
    if (mB.isEmpty()) {
      mB.add(Z.ZERO);
    } else {
      long am1 = mM - 1;
      while (!mA.isSet(am1)) {
        --am1;
      }
      final Z b = mB.last();
      mB.add(b.add(mM).subtract(am1 * (b.isEven() ? 1 : 0)));
    }
  }

  @Override
  public Z next() {
    while (mA.isSet(mM) || mB.contains(Z.valueOf(mM))) {
      ++mM;
    }
    mA.set(mM);
    updateB();
    return Z.valueOf(mM);
  }
}
