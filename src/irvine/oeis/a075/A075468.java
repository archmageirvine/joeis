package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A075457.
 * @author Sean A. Irvine
 */
public class A075468 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final Z t = Z.valueOf(++mN).pow(mN);
    long k = 0;
    while (true) {
      if (t.subtract(++k).isProbablePrime() && t.add(k).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
