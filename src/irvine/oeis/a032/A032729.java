package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032729 Numbers k such that k prefixed by '4' and followed by '9' is prime.
 * @author Sean A. Irvine
 */
public class A032729 extends Sequence1 {

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
