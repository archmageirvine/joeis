package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.ArrayList;

/**
 * A000147.
 * @author Sean A. Irvine
 */
public class A000147 implements Sequence {

  private int mN = -2;
  private final A000065 mA65 = new A000065();
  private final ArrayList<Z> mB = new ArrayList<>();

  private Z b(final int n) {
    while (n >= mB.size()) {
      mB.add(mA65.next());
    }
    return mB.get(n);
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= (mN - 1) / 2; ++k) {
      sum = sum.add(b(k).multiply(b(mN - k)));
    }
    if ((mN & 1) == 0) {
      final Z g = b(mN / 2);
      sum = sum.add(g.multiply(g.add(1)).divide2());
    }
    return sum;
  }
}

