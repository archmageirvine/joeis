package irvine.oeis.a016;

import irvine.math.z.Z;

/**
 * A016070 Numbers k such that k^2 contains exactly 2 different digits, excluding 10^m, 2*10^m, 3*10^m.
 * @author Sean A. Irvine
 */
public class A016070 extends A016069 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!t.toString().matches("[123]0+")) {
        return t;
      }
    }
  }
}
