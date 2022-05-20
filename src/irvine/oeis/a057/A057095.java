package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057095 Numbers n such that n^2 +1, n^2 +3, n^2 +7, n^2 +9 and n^2 +13 are simultaneously prime.
 * @author Sean A. Irvine
 */
public class A057095 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z n2 = Z.valueOf(++mN).square();
      if (n2.add(1).isProbablePrime() && n2.add(3).isProbablePrime() && n2.add(7).isProbablePrime() && n2.add(9).isProbablePrime() && n2.add(13).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
