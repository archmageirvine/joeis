package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032729 Numbers n such that n prefixed by <code>'4'</code> and followed by <code>'9'</code> is a prime.
 * @author Sean A. Irvine
 */
public class A032729 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z t = new Z("4" + ++mN + "9");
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
