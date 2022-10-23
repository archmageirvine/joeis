package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A032704 n prefixed by '4' and followed by '1' is prime.
 * @author Sean A. Irvine
 */
public class A032704 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z t = new Z("4" + ++mN + "1");
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
