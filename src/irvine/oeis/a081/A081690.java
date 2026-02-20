package irvine.oeis.a081;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A081690 From P-positions in a certain game.
 * @author Sean A. Irvine
 */
public class A081690 extends Sequence0 {

  protected final TreeSet<Z> mB = new TreeSet<>();
  private final LongDynamicBooleanArray mA = new LongDynamicBooleanArray();
  private long mM = 0;

  private void updateB() {
    if (mB.isEmpty()) {
      mB.add(Z.ZERO);
    } else {
      mB.add(Z.ONE.shiftLeft(mB.size()).add(mM - 1));
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
