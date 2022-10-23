package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A032722 n prefixed by '5' and followed by '7' is a prime.
 * @author Sean A. Irvine
 */
public class A032722 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z t = new Z("5" + ++mN + "7");
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
