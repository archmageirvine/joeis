package irvine.oeis.a052;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052270 Consider a room of size r X s where rs = 2n and 1 &lt;= r &lt;= s; count ways to arrange n Tatami mats in room; a(n) = total number of ways for all choices of r and s. Two arrangements are considered the same if one is a rotation or reflection of the other.
 * @author Sean A. Irvine
 */
public class A052270 implements Sequence {

  // After Jean-Fran&ccedil;ois Alcover and Dean Hickerson

  private long mN = 0;

  private long c(final long r, final long s) {
    if (s<0) {
      return 0;
    } else if (r==1) {
      return 1 - (s & 1);
    } else if (r == 2) {
      return c1(2, s) + c2(2, s) + (s == 0 ? 1 : 0);
    } else if ((r & 1) == 1) {
      return c(r, s - r + 1) + c(r, s - r - 1) + (s == 0 ? 1 : 0);
    } else {
      return c1(r, s) + c2(r, s) + (s == 0 ? 1 : 0);
    }
  }

  private long c1(final long r, final long s) {
    if (s <= 0) {
      return 0;
    } else if (r == 2) {
      return c(2, s - 1);
    } else if ((r & 1) == 0) {
      return c2(r, s - 1) + (s == 1 ? 1 : 0);
    } else {
      throw new RuntimeException();
    }
  }

  private long c2(final long r, final long s) {
    if (s <= 0) {
      return 0;
    } else if (r == 2) {
      return c1(2, s - 2) + (s == 2 ? 1 : 0);
    } else if ((r & 1) == 0) {
      return c1(r, s - r + 2) + c1(r, s - r) + (s == r - 2 ? 1 : 0) + (s == r ? 1 : 0);
    } else {
      throw new RuntimeException();
    }
  }

  private long cs(final long r, final long s) {
    if (s < 0) {
      return 0;
    } else if (r == 1) {
      return c(r, s);
    } else if (r == 2) {
      return c1s(r, s) + c2s(r, s) + (s == 0 ? 1 : 0);
    } else if ((r & 1) == 1) {
      return cs(r, s - 2 * r + 2) + cs(r, s - 2 * r - 2) + (s == 0 ? 1 : 0) + (s == r - 1 ? 1 : 0) + (s == r + 1 ? 1 : 0);
    } else {
      return c1s(r, s) + c2s(r, s) + (s == 0 ? 1 : 0);
    }
  }

  private long c1s(final long r, final long s) {
    if (s <= 0) {
      return 0;
    } else if (r == 2) {
      return cs(r, s - 2) + (s == 1 ? 1 : 0);
    } else if ((r & 1) == 0) {
      return c2s(r, s - 2) + (s == 1 ? 1 : 0);
    } else {
      throw new RuntimeException();
    }
  }

  private long c2s(final long r, final long s) {
    if (s <= 0) {
      return 0;
    } else if (r == 2) {
      return c1s(2, s - 4) + (s == 2 ? 1 : 0);
    } else if ((r & 1) == 0) {
      return c1s(r, s - 2 * r + 4) + c1s(r, s - 2 * r) + (s == r - 2 ? 1 : 0) + (s == r ? 1 : 0);
    } else {
      throw new RuntimeException();
    }
  }

  private long ti(final long r, final long s) {
    if (r > s) {
      return ti(s, r);
    } else if (r == s) {
      return 1 - (r & 1);
    } else {
      return (c(r, s) + cs(r, s)) / 2;
    }
  }

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    final Z[] divs = Cheetah.factor(2 * ++mN).divisorsSorted();
    for (int i = 0; 2 * i < divs.length; ++i) {
      final long d = divs[i].longValue();
      sum = sum.add(ti(d, 2 * mN / d));
    }
    return sum;
  }
}
