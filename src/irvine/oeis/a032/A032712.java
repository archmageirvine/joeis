package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032712 n prefixed by <code>'4'</code> and followed by <code>'3'</code> is a prime.
 * @author Sean A. Irvine
 */
public class A032712 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z t = new Z("4" + ++mN + "3");
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
