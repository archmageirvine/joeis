package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032705 Numbers n such that n prefixed by <code>'5'</code> and followed by <code>'1'</code> is prime.
 * @author Sean A. Irvine
 */
public class A032705 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z t = new Z("5" + ++mN + "1");
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
