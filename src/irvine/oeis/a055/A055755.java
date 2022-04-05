package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055755 4n^2+1, 2n^2+1, 2n^2-1 are all prime.
 * @author Sean A. Irvine
 */
public class A055755 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final Z n2 = Z.valueOf(++mN).square().multiply2();
      if (n2.add(1).isProbablePrime() && n2.subtract(1).isProbablePrime() && n2.multiply2().add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
