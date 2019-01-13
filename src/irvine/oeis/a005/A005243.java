package irvine.oeis.a005;

import java.util.ArrayList;
import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005243.
 * @author Sean A. Irvine
 */
public class A005243 implements Sequence {

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
