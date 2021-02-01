package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038676 Fourth powers ending in a (different) positive fourth power.
 * @author Sean A. Irvine
 */
public class A038676 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      // Efficiency, any fourth power ending with 1
      final Z n4 = Z.valueOf(++mN).pow(4);
      if (n4.mod(10) == 1) {
        return n4;
      }
      final String s = n4.toString();
      for (int k = s.length() - 2; k > 0; --k) {
        final Z t = new Z(s.substring(k));
        if (!t.isZero()) {
          t.root(4);
          if (t.auxiliary() == 1) {
            return n4;
          }
        }
      }
    }
  }
}
