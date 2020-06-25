package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032731 Numbers n such that n prefixed by <code>'6'</code> and followed by <code>'9'</code> is a prime.
 * @author Sean A. Irvine
 */
public class A032731 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z t = new Z("6" + ++mN + "9");
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
