package irvine.oeis.a389;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a390.A390148;

/**
 * A389940 allocated for Charles L. Hohn.
 * @author Sean A. Irvine
 */
public class A389940 extends A390148 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      step(mA);
      if (mA.first().equals(mN)) {
        return mA.pollFirst();
      }
    }
  }
}
