package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032719 Numbers k such that k prefixed by '2' and followed by '7' is prime.
 * @author Sean A. Irvine
 */
public class A032719 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z t = new Z("2" + ++mN + "7");
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
