package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003321.
 * @author Sean A. Irvine
 */
public class A003321 implements Sequence {

  // After Derek Orr

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    int m = 1;
    Z z = Z.TEN;
    final Z nines = Z.NINE.pow(mN);
    while (nines.multiply(m).compareTo(z) >= 0) {
      ++m;
      z = z.multiply(10);
    }
    for (Z k = Z.TWO; k.compareTo(z) <= 0; k = k.add(1)) {
      final String d = k.toString();
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
