package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068008 Least number needed to be appended to n n's to make a prime that does not contain more than n n's in a row.
 * @author Sean A. Irvine
 */
public class A068008 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.TWO; // Only even term
    }
    final String t = String.valueOf(mN);
    final String s = t.repeat(mN);
    long k = -1;
    while (true) {
      k += 2;
      final String v = String.valueOf(k);
      if (!v.startsWith(t) && new Z(s + v).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
