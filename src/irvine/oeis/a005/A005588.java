package irvine.oeis.a005;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.a002.A002658;

/**
 * A005588 Number of free binary trees admitting height n.
 * @author Sean A. Irvine
 */
public class A005588 extends A002658 {

  private int mN = 0;
  private final ArrayList<Z> mP = new ArrayList<>();
  private final ArrayList<Z> mQ = new ArrayList<>();

  {
    mP.add(Z.ZERO);
    mP.add(super.next());
    mQ.add(Z.ZERO);
    mQ.add(Z.ONE);
    super.next();
  }

  private Z bin2(final Z n) {
    return n.multiply(n.subtract(1)).divide2();
  }

  private Z bin3(final Z n) {
    return n.multiply(n.subtract(1)).multiply(n.subtract(2)).divide(6);
  }

  private Z p(final int h) {
    return mP.get(h);
  }

  private Z q(final int h) {
    while (h >= mQ.size()) {
      final int ha = mQ.size() - 1;
      mQ.add(mQ.get(ha).add(p(ha)));
    }
    return mQ.get(h);
  }

  private Z a(final int h) {
    return bin3(p(h).add(2)).add(bin2(p(h).add(1)).multiply(q(h)));
  }

  private Z b(final int h) {
    return bin2(p(h).add(1));
  }

  private Z d(final int h, final int i) {
    if (i == h) {
      return Z.ZERO;
    }
    if (i > h) {
      return p(h);
    }
    if (i == 1) {
      return p(h).subtract(p(h - 1));
    }
    final Z d = d(h - 1, i - 1);
    return bin2(d.add(1)).add(d.multiply(e(h - 1, i - 1)));
  }

  private Z e(final int h, final int i) {
    if (i == 1) {
      return p(h - 1);
    }
    Z sum = Z.ONE;
    for (int j = 1; j < h; ++j) {
      sum = sum.add(d(j, i));
    }
    return sum;
  }

  @Override
  public Z next() {
    ++mN;
    mP.add(super.next());
    Z sum = bin2(p(mN).add(1));
    for (int i = 1; i <= mN / 2; ++i) {
      final int hi = mN - i;
      sum = sum.add(a(hi));
      sum = sum.subtract(bin3(d(hi, i).add(2)));
      sum = sum.subtract(bin2(d(hi, i).add(1)).multiply(e(hi, i)));
    }
    for (int i = 1; i <= (mN + 1) / 2; ++i) {
      sum = sum.add(b(mN - i + 1));
      sum = sum.subtract(bin2(d(mN - i + 1, i).add(1)));
    }
    return sum;
  }
}

