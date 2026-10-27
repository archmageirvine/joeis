package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087038 Smallest integer x &gt; 1 such that x^x + n is prime, or 0 if no such x exists.
 * @author Sean A. Irvine
 */
public class A087038 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while (true) {
      if (Z.valueOf(++k).pow(k).add(mN).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
