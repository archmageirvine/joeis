package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a003.A003446;

/**
 * A000908.
 * @author Sean A. Irvine
 */
public class A000908 extends A003446 {

  {
    super.next();
  }

  private Z u(final long m) {
    return Binomial.binomial(2 * m, m).divide(m + 1);
  }

  private Z d3h(final long m) {
    if (m <= 2) {
      return m == 0 ? Z.ONE : Z.ZERO;
    }
    final long n = m - 3;
    if (n % 6 != 0) {
      return Z.ZERO;
    }
    return u(n / 6);
  }

  private Z c3h(final long m) {
    return (m % 3 == 0 ? u(m / 3) : Z.ZERO).subtract((m - 3) % 6 == 0 ? u((m - 3) / 6) : Z.ZERO).divide2();
  }

  private Z c2v(final long m) {
    if ((m & 1) == 0) {
      return m > 1 ? u(m / 2) : Z.ZERO;
    }
    if (m == 1) {
      return Z.ONE;
    }
    final Z j = u((m + 1) / 2);
    return (m - 3) % 6 == 0 ? j.subtract(u((m - 3) / 6)) : j;
  }

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    //System.out.println("d3h=" + d3h(mN) + " c3h=" + c3h(mN) + " c2v=" + c2v(mN));
    return super.next().subtract(d3h(mN)).subtract(c3h(mN)).subtract(c2v(mN));
  }
}

