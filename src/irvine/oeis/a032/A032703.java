package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032703 n prefixed by <code>'3'</code> and followed by <code>'1'</code> is a prime.
 * @author Sean A. Irvine
 */
public class A032703 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z t = new Z("3" + ++mN + "1");
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
