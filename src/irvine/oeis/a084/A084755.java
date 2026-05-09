package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084755 Let the sequence s_n be defined by s_n(1) = n+1 and for k &gt; 1, s_n(k) = k*s_n(k-1)+1. Then a(n) is the first prime in the sequence s_n.
 * @author Sean A. Irvine
 */
public class A084755 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    Z s = Z.valueOf(++mN);
    long k = 1;
    while (!s.isProbablePrime()) {
      s = s.multiply(++k).add(1);
    }
    return s;
  }
}
