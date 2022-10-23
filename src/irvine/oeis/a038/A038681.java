package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038681 Fifth powers ending nontrivially in a nonzero fifth power.
 * @author Sean A. Irvine
 */
public class A038681 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      // Efficiency, any fifth power ending with 1
      final Z n5 = Z.valueOf(++mN).pow(5);
      if (n5.mod(10) == 1) {
        return n5;
      }
      final String s = n5.toString();
      for (int k = s.length() - 2; k > 0; --k) {
        final Z t = new Z(s.substring(k));
        if (!t.isZero()) {
          t.root(5);
          if (t.auxiliary() == 1) {
            return n5;
          }
        }
      }
    }
  }
}
