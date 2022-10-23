package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038686 Tenth powers ending nontrivially in a nonzero tenth power.
 * @author Sean A. Irvine
 */
public class A038686 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      // Efficiency, any seventh power ending with 1
      final Z n10 = Z.valueOf(++mN).pow(10);
      if (n10.mod(10) == 1) {
        return n10;
      }
      final String s = n10.toString();
      for (int k = s.length() - 2; k > 0; --k) {
        final Z t = new Z(s.substring(k));
        if (!t.isZero()) {
          t.root(10);
          if (t.auxiliary() == 1) {
            return n10;
          }
        }
      }
    }
  }
}
