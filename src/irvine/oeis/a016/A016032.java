package irvine.oeis.a016;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.a018.A018782;

/**
 * A016032 Least positive integer that is the sum of two squares of positive integers in exactly n ways.
 * @author Sean A. Irvine
 */
public class A016032 extends A018782 {

  private int mN = 0;
  private final ArrayList<Z> mA18782 = new ArrayList<>();

  private Z getA18782(final int n) {
    while (n >= mA18782.size()) {
      mA18782.add(super.next());
    }
    return mA18782.get(n);
  }

  @Override
  public Z next() {
    ++mN;
    return getA18782(2 * mN).min(getA18782(2 * mN - 1)).min(getA18782(2 * mN - 2).multiply2());
  }
}
