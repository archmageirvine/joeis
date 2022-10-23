package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A032715 n prefixed by '7' and followed by '3' is a prime.
 * @author Sean A. Irvine
 */
public class A032715 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z t = new Z("7" + ++mN + "3");
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
