package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390466 a(n) is the least k such that k + n * A001414(k) and k - n * A001414(k) are both prime.
 * @author Sean A. Irvine
 */
public class A390466 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = mN;
    while (true) {
      final Z t = Functions.SOPFR.z(++k).multiply(mN);
      if (t.add(k).isProbablePrime() && t.negate().add(k).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
