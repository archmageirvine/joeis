package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038684 Eighth powers ending nontrivially in a nonzero eighth power.
 * @author Sean A. Irvine
 */
public class A038684 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      // Efficiency, any seventh power ending with 1
      final Z n8 = Z.valueOf(++mN).pow(8);
      if (n8.mod(10) == 1) {
        return n8;
      }
      final String s = n8.toString();
      for (int k = s.length() - 2; k > 0; --k) {
        final Z t = new Z(s.substring(k));
        if (!t.isZero()) {
          t.root(8);
          if (t.auxiliary() == 1) {
            return n8;
          }
        }
      }
    }
  }
}
