package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035930 Maximal product of any two numbers whose concatenation is n.
 * @author Sean A. Irvine
 */
public class A035930 implements Sequence {

  private static final Z Z100 = Z.valueOf(100);
  private long mN = -1;

  static Z f(final Z n) {
    if (n.compareTo(Z100) < 0) {
      final long m = n.longValue();
      // Only for efficiency, this case is not really needed
      return Z.valueOf((m / 10) * (m % 10));
    }
    final String s = String.valueOf(n);
    Z max = Z.ZERO;
    for (int k = 1; k < s.length(); ++k) {
      max = max.max(new Z(s.substring(0, k)).multiply(new Z(s.substring(k))));
    }
    return max;
  }

  @Override
  public Z next() {
    return f(Z.valueOf(++mN));
  }
}

