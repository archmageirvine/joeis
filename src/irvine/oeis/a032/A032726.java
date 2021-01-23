package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032726 Numbers n such that n prefixed by '1' and followed by '9' is a prime.
 * @author Sean A. Irvine
 */
public class A032726 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z t = new Z("1" + ++mN + "9");
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
