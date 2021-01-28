package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038682 Sixth powers ending nontrivially in a nonzero sixth power.
 * @author Sean A. Irvine
 */
public class A038682 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      // Efficiency, any sixth power ending with 1
      final Z n6 = Z.valueOf(++mN).pow(6);
      if (n6.mod(10) == 1) {
        return n6;
      }
      final String s = n6.toString();
      for (int k = s.length() - 2; k > 0; --k) {
        final Z t = new Z(s.substring(k));
        if (!t.isZero()) {
          t.root(6);
          if (t.auxiliary() == 1) {
            return n6;
          }
        }
      }
    }
  }
}
