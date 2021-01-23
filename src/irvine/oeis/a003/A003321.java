package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003321 Smallest n-th order perfect digital invariant or PDI: smallest number &gt; 1 equal to sum of n-th powers of its digits, or 0 if no such number.
 * @author Sean A. Irvine
 */
public class A003321 implements Sequence {

  // After Derek Orr

  private int mN = 0;

  protected int base() {
    return 10;
  }

  @Override
  public Z next() {
    ++mN;
    int m = 1;
    Z z = Z.valueOf(base());
    final Z nines = z.subtract(1).pow(mN);
    while (nines.multiply(m).compareTo(z) >= 0) {
      ++m;
      z = z.multiply(base());
    }
    for (Z k = Z.TWO; k.compareTo(z) <= 0; k = k.add(1)) {
      final String d = k.toString(base());
      Z s = Z.ZERO;
      for (int i = 0; i < d.length(); ++i) {
        s = s.add(Z.valueOf(d.charAt(i) - '0').pow(mN));
      }
      if (s.equals(k)) {
        return k;
      }
    }
    return Z.ZERO;
  }
}
