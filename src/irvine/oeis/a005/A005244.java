package irvine.oeis.a005;

import java.util.ArrayList;
import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005244 A self-generating sequence: start with 2 and 3, take all products of any 2 previous elements, subtract 1 and adjoin them to the sequence.
 * @author Sean A. Irvine
 */
public class A005244 implements Sequence {

  private final HashSet<Z> mSet = new HashSet<>();
  private final ArrayList<Z> mA = new ArrayList<>();
  private Z mV = Z.ZERO;

  {
    mSet.add(Z.TWO);
    mSet.add(Z.THREE);
  }

  @Override
  public Z next() {
    do {
      mV = mV.add(1);
    } while (!mSet.remove(mV));
    for (final Z a : mA) {
      mSet.add(mV.multiply(a).subtract(1));
    }
    mA.add(mV);
    return mV;
  }
}
