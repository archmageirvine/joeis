package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038683 Seventh powers ending nontrivially in a nonzero seventh power.
 * @author Sean A. Irvine
 */
public class A038683 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      // Efficiency, any seventh power ending with 1
      final Z n7 = Z.valueOf(++mN).pow(7);
      if (n7.mod(10) == 1) {
        return n7;
      }
      final String s = n7.toString();
      for (int k = s.length() - 2; k > 0; --k) {
        final Z t = new Z(s.substring(k));
        if (!t.isZero()) {
          t.root(7);
          if (t.auxiliary() == 1) {
            return n7;
          }
        }
      }
    }
  }
}
