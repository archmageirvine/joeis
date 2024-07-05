package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071176 Smallest k such that the concatenation of n and k is a square (decimal notation).
 * @author Sean A. Irvine
 */
public class A071176 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN).multiply(10);
    long k = -1;
    long m = 10;
    while (true) {
      if (++k >= m) {
        m *= 10;
        t = t.multiply(10);
      }
      if (t.add(k).isSquare()) {
        return Z.valueOf(k);
      }
    }
  }
}
