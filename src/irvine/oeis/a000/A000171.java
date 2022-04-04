package irvine.oeis.a000;

import irvine.math.IntegerUtils;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.partitions.IntegerPartition;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000171 Number of self-complementary graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A000171 implements Sequence {

  private final MemoryFactorial mFactorial = MemoryFactorial.SINGLETON;
  private int mN = 0;

  private Z period(final int[] k) {
    Z c = Z.ONE;
    for (int j = 1; j < k.length; ++j) {
      c = c.multiply(mFactorial.factorial(k[j])).multiply(Z.valueOf(4L * j).pow(k[j]));
    }
    return c;
  }

  private int power0(final int[] k) {
    int p1 = 0;
    for (int s = 1; s < k.length; ++s) {
      p1 += s * k[s] * k[s];
    }
    int p2 = 0;
    for (int alpha = 1; alpha < k.length; ++alpha) {
      for (int beta = alpha + 1; beta < k.length; ++beta) {
        p2 += k[alpha] * k[beta] * IntegerUtils.gcd(alpha, beta);
      }
    }
    return p1 * 2 + p2 * 4;
  }

  private int power1(final int[] k) {
    int p = 0;
    for (int s = 1; s < k.length; ++s) {
      p += k[s];
    }
    return p + power0(k);
  }

  @Override
  public Z next() {
    final int r = ++mN & 3;
    if (r > 1) {
      return Z.ZERO;
    }

    // Calculation based on method described by C. R. J. Clapham in
    // "An Easier Enumeration of Self-Complementary Graphs",
    // Proc. Edinburgh Math. Soc., 27, pp. 181--183, 1984.

    final int n = mN / 4;
    if (n == 0) {
      return Z.ONE;
    }
    final IntegerPartition ip = new IntegerPartition(n);
    final int[] k = new int[n + 1];
    Q s = Q.ZERO;
    int[] p;
    if (r == 0) {
      while ((p = ip.next()) != null) {
        IntegerPartition.toCountForm(p, k);
        s = s.add(new Q(Z.ONE.shiftLeft(power0(k)), period(k)));
      }
    } else {
      while ((p = ip.next()) != null) {
        IntegerPartition.toCountForm(p, k);
        s = s.add(new Q(Z.ONE.shiftLeft(power1(k)), period(k)));
      }
    }
    return s.toZ();
  }
}
