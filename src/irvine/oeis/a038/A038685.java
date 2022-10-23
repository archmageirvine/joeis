package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038685 Ninth powers ending nontrivially in a nonzero ninth power.
 * @author Sean A. Irvine
 */
public class A038685 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      // Efficiency, any seventh power ending with 1
      final Z n9 = Z.valueOf(++mN).pow(9);
      if (n9.mod(10) == 1) {
        return n9;
      }
      final String s = n9.toString();
      for (int k = s.length() - 2; k > 0; --k) {
        final Z t = new Z(s.substring(k));
        if (!t.isZero()) {
          t.root(9);
          if (t.auxiliary() == 1) {
            return n9;
          }
        }
      }
    }
  }
}
