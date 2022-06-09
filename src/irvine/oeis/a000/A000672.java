package irvine.oeis.a000;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.a001.A001190;

/**
 * A000672 Number of 3-valent trees (= boron trees or binary trees) with n nodes.
 * @author Sean A. Irvine
 */
public class A000672 extends A001190 {

  private final ArrayList<Z> mS = new ArrayList<>();

  private Z bin2(final Z n) {
    return n.square().subtract(n).divide2();
  }

  private Z bin3(final Z n) {
    final Z ns = n.square();
    return ns.multiply(n).subtract(ns.multiply(3)).add(n.multiply2()).divide(6);
  }

  private Z b(final int n) {
    return mS.get(n + 1);
  }

  private Z b(final int n, final int d) {
    if (n % d == 0) {
      return mS.get(n / d + 1);
    } else {
      return Z.ZERO;
    }
  }

  {
    mS.add(super.next());
    mS.add(super.next());
    mS.add(super.next());
  }

  @Override
  public Z next() {
    mS.add(super.next());
    final int n = mN - 4;
    if (n < 3) {
      return Z.ONE;
    }
    Z s = b(n + 1).multiply2()
      .subtract(b(n + 2))
      .add(b(n + 1, 2))
      .subtract(bin3(b(n, 3).add(1)).multiply2());
    for (int k = 1; k <= (n - 1) / 2; ++k) {
      s = s.subtract(bin2(b(k)).multiply(b(n - 2 * k)));
    }
    for (int k = 1; k <= n / 3; ++k) {
      Z t = Z.ZERO;
      for (int j = k; j <= (n - k) / 2; ++j) {
        t = t.add(b(j).multiply(b(n - k - j)));
      }
      s = s.add(t.multiply(b(k)));
    }
    return s;
  }
}

