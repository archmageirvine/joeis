package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A032728 n prefixed by '3' and followed by '9' is a prime.
 * @author Sean A. Irvine
 */
public class A032728 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z t = new Z("3" + ++mN + "9");
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
