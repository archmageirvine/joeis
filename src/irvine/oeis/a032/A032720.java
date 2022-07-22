package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032720 Integers that when prefixed by '3' and followed by '7' yield a prime.
 * @author Sean A. Irvine
 */
public class A032720 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z t = new Z("3" + ++mN + "7");
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
