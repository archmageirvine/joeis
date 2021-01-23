package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032713 Numbers n such that n prefixed by '5' and followed by '3' is prime.
 * @author Sean A. Irvine
 */
public class A032713 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z t = new Z("5" + ++mN + "3");
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
