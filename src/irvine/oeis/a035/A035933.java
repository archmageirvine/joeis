package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035933 Smallest number that takes n steps to reach 0 under "k-&gt;min product of 2 numbers whose concatenation is k".
 * @author Sean A. Irvine
 */
public class A035933 implements Sequence {

  private static Z Z100 = Z.valueOf(100);

  static Z f(final Z n) {
    if (n.compareTo(Z100) < 0) {
      final long m = n.longValue();
      // Only for efficiency, this case is not really needed
      return Z.valueOf((m / 10) * (m % 10));
    }
    final String s = String.valueOf(n);
    Z min = n;
    for (int k = 1; k < s.length(); ++k) {
      min = min.min(new Z(s.substring(0, k)).multiply(new Z(s.substring(k))));
    }
    return min;
  }

  private long mN = -1;
  private long mM = -1;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      long c = 0;
      Z t = Z.valueOf(++mM);
      while (!Z.ZERO.equals(t)) {
        t = f(t);
        ++c;
      }
      if (c == mN) {
        return Z.valueOf(mM);
      }
    }
  }
}

