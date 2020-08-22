package irvine.oeis.a022;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.a002.A002182;

/**
 * A022404 Least highly composite number divisible by n.
 * @author Sean A. Irvine
 */
public class A022404 extends A002182 {

  private final ArrayList<Z> mH = new ArrayList<>();
  private int mN = 0;

  private Z get(final int n) {
    while (n >= mH.size()) {
      mH.add(super.next());
    }
    return mH.get(n);
  }

  @Override
  public Z next() {
    ++mN;
    int k = -1;
    while (true) {
      if (get(++k).mod(mN) == 0) {
        return get(k);
      }
    }
  }
}
