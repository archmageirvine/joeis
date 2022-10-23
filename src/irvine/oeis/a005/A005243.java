package irvine.oeis.a005;

import java.util.ArrayList;
import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005243 A self-generating sequence: start with 1 and 2, take all sums of any number of successive previous elements and adjoin them to the sequence. Repeat!.
 * @author Sean A. Irvine
 */
public class A005243 extends Sequence1 {

  private final HashSet<Z> mSet = new HashSet<>();
  private final ArrayList<Z> mA = new ArrayList<>();
  private Z mV = Z.ZERO;

  {
    mSet.add(Z.ONE);
    mSet.add(Z.TWO);
  }

  @Override
  public Z next() {
    do {
      mV = mV.add(1);
    } while (!mSet.remove(mV));
    mA.add(mV);
    Z s = Z.ZERO;
    for (int i = mA.size() - 1; i >= 0; --i) {
      s = s.add(mA.get(i));
      mSet.add(s);
    }
    return mV;
  }
}
