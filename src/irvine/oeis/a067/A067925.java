package irvine.oeis.a067;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067925 Consider a room of size r X s where rs = 2n and 1 &lt;= r, 1 &lt;= s; count ways to arrange n Tatami mats in room; a(n) = total number of ways for all choices of r and s. Two arrangements are distinguished if one is a rotation or reflection of the other.
 * @author Sean A. Irvine
 */
public class A067925 extends Sequence1 {

  // After Jean-Fran&ccedil;ois Alcover and Dean Hickerson

  private int mN = 0;

  private Z c1(final int r, final int s) {
    if (s <= 0) {
      return Z.ZERO;
    }
    if (r == 2) {
      return c(2, s - 1);
    }
    return c2(r, s - 1).add(s == 1 ? 1 : 0);
  }

  private Z c2(final int r, final int s) {
    if (s <= 0) {
      return Z.ZERO;
    }
    if (r == 2) {
      return c1(2, s - 2).add(s == 2 ? 1 : 0);
    }
    return c1(r, s - r + 2).add(c1(r, s - r)).add(s == r - 2 ? 1 : 0).add(s == r ? 1 : 0);
  }

  private Z c(final int r, final int s) {
    if (s < 0) {
      return Z.ZERO;
    }
    if (r == 1) {
      return (s & 1) == 0 ? Z.ONE : Z.ZERO;
    }
    if (r == 2) {
      return c1(2, s).add(c2(2, s)).add(s == 0 ? 1 : 0);
    }
    if ((r & 1) == 1) {
      return c(r, s - r + 1).add(c(r, s - r - 1)).add(s == 0 ? 1 : 0);
    }
    return c1(r, s).add(c2(r, s)).add(s == 0 ? 1 : 0);
  }

  private Z t(final int r, final int s) {
    if (r > s) {
      return t(s, r);
    }
    if (r > 1 && (r & 1) == 1) {
      return c(r, s).multiply2();
    }
    return c(r, s);
  }

  @Override
  public Z next() {
    mN += 2;
    return Integers.SINGLETON.sumdiv(mN, d -> t(d, mN / d));
  }

}
