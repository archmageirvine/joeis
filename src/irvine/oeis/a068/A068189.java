package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A068189 Smallest positive number whose product of digits equals n, or a(n)=0 if no such number exists, i.e. when n has a prime divisor greater than 7.
 * @author Sean A. Irvine
 */
public class A068189 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z a(final Z n) {
    if (n.equals(Z.ONE)) {
      return Z.ONE;
    }
    final FactorSequence fs = Jaguar.factor(n);
    final Z[] p = fs.toZArray();
    if (p[p.length - 1].compareTo(Z.SEVEN) > 0) {
      return Z.ZERO;
    }
    final int e7 = fs.getExponent(Z.SEVEN);
    final int e5 = fs.getExponent(Z.FIVE);
    int e3 = fs.getExponent(Z.THREE);
    int e2 = fs.getExponent(Z.TWO);
    final int c9 = e3 / 2;
    e3 -= 2 * c9;
    final int c8 = e2 / 3;
    e2 -= 3 * c8;
    final int c6 = Math.min(e2, e3);
    e2 -= c6;
    e3 -= c6;
    final int c4 = e2 / 2;
    e2 -= 2 * c4;
    final StringBuilder sb = new StringBuilder();
    sb.append("2".repeat(e2));
    sb.append("3".repeat(e3));
    sb.append("4".repeat(c4));
    sb.append("5".repeat(e5));
    sb.append("6".repeat(c6));
    sb.append("7".repeat(e7));
    sb.append("8".repeat(c8));
    sb.append("9".repeat(c9));
    return new Z(sb);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }
}
