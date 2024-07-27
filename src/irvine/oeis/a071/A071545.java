package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071545 Smallest k such that n+k divides (k+1)!+k!.
 * @author Sean A. Irvine
 */
public class A071545 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z f = Z.ONE;
    long k = 0;
    while (true) {
      final Z t = f;
      f = f.multiply(++k + 1);
      if (f.add(t).mod(mN + k) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}
