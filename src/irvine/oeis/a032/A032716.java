package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032716 Numbers n such that n prefixed by <code>'8'</code> and followed by <code>'3'</code> is prime.
 * @author Sean A. Irvine
 */
public class A032716 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z t = new Z("8" + ++mN + "3");
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
